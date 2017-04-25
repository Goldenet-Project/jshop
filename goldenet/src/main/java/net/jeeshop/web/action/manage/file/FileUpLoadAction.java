package net.jeeshop.web.action.manage.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.jeeshop.services.manage.fileOut.FileOutService;
import net.jeeshop.services.manage.fileOut.bean.FileOutVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * 文件上传Controller类
 * 
 * @author Yang
 *
 */
@Controller
@RequestMapping("/manage/fileOut/")
public class FileUpLoadAction {

	@Autowired
	private FileOutService fileOutService;

	// 上传文件页面
	private static final String Page_toUpLoad = "manage/fileload/fileUpLoad";
	private static final String Page_UpLoadSuccess = "manage/fileload/fileUpLoadSuccess";
	private static final String Page_UpLoadErro = "manage/fileload/fileUpLoadErro";
	private static final String Page_DownLoadErr = "manage/fileload/fileDownLoadErr";
	private static final String Page_selectDownLoad = "manage/fileload/selectDownLoad";

	public FileOutService getFileOutService() {
		return fileOutService;
	}

	public void setFileOutService(FileOutService fileOutService) {
		this.fileOutService = fileOutService;
	}

	/**
	 * 
	 * @param
	 * @Description: TODO(获取产品主键id跳转到上传文件页面)
	 * @author yc
	 * @date 2017年4月20日 下午4:58:20
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping("toUpLoad")
	public String toFileUpLoad(HttpServletRequest request,
			HttpServletResponse response, FileOutVO file, ModelMap model) {
		// 根据url路劲参数地址获取商品的id
		String productid = request.getParameter("productID");
		// 将产品id传入到上传文件页面
		model.addAttribute("productId", productid);
		return Page_toUpLoad;
	}

	/**
	 * 
	 * @param
	 * @Description: TODO(控制文件上传的方法)
	 * @author yc
	 * @date 2017年4月21日 下午1:14:15
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping("fileUpLoad")
	public String fileUpLoad(
			@RequestParam("file") CommonsMultipartFile[] files,
			HttpServletRequest request, HttpServletResponse response,
			FileOutVO file, ModelMap model) {
		boolean flag = false;
		// 准备参数文件名称
		String fileName = "";
		// 文件大小
		long fileSize;
		// 文件存放地址
		String fileAddr = "";
		// 文件类型
		String fileType = "";
		
		
		for (int i = 0; i < files.length; i++) {
			//List <FileOutVO>fileList=fileOutService.selectListByProductId(file.getProductId());
			FileOutVO fileVo=fileOutService.selectByFileName(files[i].getOriginalFilename());
			
			if(null != fileVo && fileVo.getFileName().equals(files[i].getOriginalFilename()))
			{
				model.addAttribute("productId", file.getProductId());
				model.addAttribute("errMsg", "该文件已经上传");
				flag=false;
			}else{
				fileName = files[i].getOriginalFilename();
				fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
				if (!files[i].isEmpty()) {
					try {
						fileAddr = "G:/fileload/" + files[i].getOriginalFilename();
						fileSize = (files[i].getSize() / 1024);//转换单位m
						// 拿到输出流
						FileOutputStream fos = new FileOutputStream(fileAddr);
						// 拿到上传文件的输入流
						InputStream in = files[i].getInputStream();
						int b = 0;
						while ((b = in.read()) != -1) {
							fos.write(b);
						}
						fos.flush();
						fos.close();
						in.close();

						// 向文件输出对象set相关的数据值
						file.setFileName(fileName);
						file.setFileSize(fileSize);
						file.setFileType(fileType);
						file.setFileAddr(fileAddr);
						// 调用逻辑层实现新增上传文件的数据
						fileOutService.insert(file);
						flag = true;

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("文件上传出错");
						flag = false;
					}
				}
			}
			
		}

		if (flag != true) {
			return Page_UpLoadErro;
			
		} else {
			return Page_UpLoadSuccess;
		}
	}
	
	@RequestMapping("toDownload")
	public String toDownload(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, FileOutVO file)
	{
		// 获取产品的主键id用于查询先关的数据文件信息
		String productId = request.getParameter("productID");
		List <FileOutVO> fileList=fileOutService.selectListByProductId(productId);
		if(null != fileList)
		{
			model.addAttribute("fileList", fileList);
		}
		
		return Page_selectDownLoad;
	}
	/**
	 * 
	 * @param
	 * @Description: TODO(控制数据文件的下载方法)
	 * @author yc
	 * @date 2017年4月21日 下午3:19:18
	 * @return String 返回类型
	 * @throws
	 */
	@RequestMapping("Download")
	public String Download(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, FileOutVO file)
			throws UnsupportedEncodingException {
		// 获取产品的主键id用于查询先关的数据文件信息
		String id = request.getParameter("id");
		// 调用逻辑层根据产品主键id查询关联的数据文件信息用于后面的文件下载
		//file = fileOutService.selectByProductId(id);
		file=fileOutService.selectById(id);
		if(file!=null)
		{
			// 获取文件名称
			String fileName = file.getFileName();
			response.setCharacterEncoding("utf-8");
			response.setContentType("multipart/form-data");
			response.setHeader("Content-Disposition", "attachment;fileName="
					+ new String(fileName.getBytes("utf-8"), "ISO-8859-1"));
			try {
				String path = file.getFileAddr();
				InputStream inputStream = new FileInputStream(new File(path));
				OutputStream os = response.getOutputStream();
				byte[] b = new byte[2048];
				int length;
				while ((length = inputStream.read(b)) > 0) {
					os.write(b, 0, length);
				}
				os.close();
				inputStream.close();
				//调用逻辑层修改下载时间
				Date date=new Date();
				file.setDownLoadTime(date);
				file.setId(id);
				fileOutService.updateDownLoadTime(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			request.setAttribute("msg", "抱歉服务器还未有该数据的资源");
			return Page_DownLoadErr;
		}
		return null;
		
	}
}
