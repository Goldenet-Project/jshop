package net.jeeshop.core.util.hadoop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;

public class hdfsUtils {

	// 文件系统连接到 hdfs的配置信息
	public static Configuration getConf() {
		Configuration conf = new Configuration();
		// 这句话很关键，这些信息就是hadoop配置文件中的信息
		conf.set("mapred.job.tracker", "10.5.5.244:9001");
		conf.set("fs.default.name", "hdfs://10.5.5.244:9000");
		return conf;
	}

	/**
	 * 从 HDFS 下载
	 * @param src
	 *            远程路径
	 * @param dst
	 *            本地路径
	 * @param conf
	 * @return
	 */
	public static boolean getFromHDFS(String src, String dst, Configuration conf) {
		Path dstPath = new Path(dst);
		try {
			FileSystem dhfs = dstPath.getFileSystem(conf);
			dhfs.copyToLocalFile(false, new Path(src), dstPath, true);
		} catch (Exception ie) {
			ie.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 获取HDFS集群上所有节点名称信息
	 * 
	 * @throws IOException
	 */
	public static void getDateNodeHost() throws IOException {
		Configuration conf = getConf();
		FileSystem fs = FileSystem.get(conf);
		DistributedFileSystem hdfs = (DistributedFileSystem) fs;
		DatanodeInfo[] dataNodeStats = hdfs.getDataNodeStats();
		for (int i = 0; i < dataNodeStats.length; i++) {
			System.out.println("DataNode_" + i + "_Name:" + dataNodeStats[i].getHostName());
		}
	}

	/**
	 * 删除hdfs 远程文件夹
	 * 
	 * @param dst
	 * @return
	 * @throws IOException
	 */
	public static boolean deleteHDFSFile(String dst) throws IOException {
		Configuration conf = getConf();
		FileSystem hdfs = FileSystem.get(conf);
		Path path = new Path(dst);
		boolean isDeleted = hdfs.delete(path);
		hdfs.close();
		return isDeleted;
	}

	/**
	 * 创建文件夹
	 * 
	 * @param dir
	 * @throws IOException
	 */
	public static void mkdir(String dir) throws IOException {
		Configuration conf = getConf();
		FileSystem fs = FileSystem.get(conf);
		fs.mkdirs(new Path(dir));
		fs.close();
	}

	/**
	 * 显示所有文件夹
	 * 
	 * @param dir
	 * @throws IOException
	 */
	public static List listAll(String dir) throws IOException {
		Configuration conf = getConf();
		FileSystem fs = FileSystem.get(conf);
		FileStatus[] stats = fs.listStatus(new Path(dir));
		List fileList = new ArrayList();
		for (int i = 0; i < stats.length; ++i) {
			if (!stats[i].isDir()) {
				// regular file
				fileList.add(stats[i].getPath().toString());
				System.out.println(stats[i].getPath().toString());
			} else {
				System.out.println(stats[i].getPath().toString());
			}
		}
		return fileList;
	}

	/**
	 * 获取HDFS文件流
	 * 
	 * @param conf
	 * @throws IOException
	 */
	public static void getFileStream(Configuration conf) throws IOException {
		String dst = "hdfs://10.5.5.100:9000//dataFile/workData.rar";
		FileSystem fs = FileSystem.get(URI.create(dst), conf);
		FSDataInputStream hdfsInStream = fs.open(new Path(dst));
		OutputStream out = new FileOutputStream("F:/qq-hdfs.rar");
		byte[] ioBuffer = new byte[1024];
		int readLen = hdfsInStream.read(ioBuffer);
		while (-1 != readLen) {
			out.write(ioBuffer, 0, readLen);
			readLen = hdfsInStream.read(ioBuffer);
		}
		out.close();
		hdfsInStream.close();
		fs.close();
	}

	public static boolean sendFile(String path, String localfile) {
		Configuration conf = getConf();
		File file = new File(localfile);
		if (!file.isFile()) {
			System.out.println(file.getName());
			return false;
		}
		try {
			FileSystem localFS = FileSystem.getLocal(conf);
			FileSystem hadoopFS = FileSystem.get(conf);
			Path hadPath = new Path(path);
			FSDataOutputStream fsOut = hadoopFS.create(new Path(path + "/" + file.getName()));
			FSDataInputStream fsIn = localFS.open(new Path(localfile));
			byte[] buf = new byte[1024];
			int readbytes = 0;
			while ((readbytes = fsIn.read(buf)) > 0) {
				fsOut.write(buf, 0, readbytes);
			}
			fsIn.close();
			fsOut.close();
			FileStatus[] hadfiles = hadoopFS.listStatus(hadPath);
			for (FileStatus fs : hadfiles) {
				System.out.println(fs.toString());
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}


}
