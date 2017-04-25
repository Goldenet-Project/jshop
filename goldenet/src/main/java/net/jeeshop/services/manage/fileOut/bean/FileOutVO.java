package net.jeeshop.services.manage.fileOut.bean;

import java.util.Date;

import net.jeeshop.core.dao.QueryModel;

/**
 * 控制文件上传下载的实体类
 * @author Yang
 *
 */
public class FileOutVO extends QueryModel{
	//主键id
	private  String id;
	//文件名称
	private String fileName;
	//文件大小
	private long fileSize;
	//文件上存放的地址路径
	private String fileAddr;
	//文件类型 
	private String fileType;
	//创建日期
	private Date createTime;
	//文件最后一次被下载的时间
	private Date downLoadTime;
	//外键 产品主键id
	private String productId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	
	public String getFileAddr() {
		return fileAddr;
	}
	public void setFileAddr(String fileAddr) {
		this.fileAddr = fileAddr;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getDownLoadTime() {
		return downLoadTime;
	}
	public void setDownLoadTime(Date downLoadTime) {
		this.downLoadTime = downLoadTime;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
}
