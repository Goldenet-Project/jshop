package net.jeeshop.core.util.hadoop;

import java.io.IOException;

public class test {

	public static void main(String[] args) {
			 //hdfsUtils.sendFile("hdfs://10.5.5.100:9000/mydata/","H:/aaaa.rar");
		try {
			hdfsUtils.listAll("/hbase");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
