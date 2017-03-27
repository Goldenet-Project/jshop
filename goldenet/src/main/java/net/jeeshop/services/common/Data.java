package net.jeeshop.services.common;

import java.io.Serializable;

import net.jeeshop.core.dao.page.PagerModel;

public class Data extends PagerModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String dataName;
	private int dataSizeOfCollect;
	private int dataSizeOfUpload;
	private int price;
	private String copyRight;
	private String description;
	private int purchaseAmount;
	private int deleteFlag;
	private String dataHdfsUrl;
	private String updateAccount;
	private String createtime;
	private String updatetime;
	private String createAccount;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public int getDataSizeOfCollect() {
		return dataSizeOfCollect;
	}

	public void setDataSizeOfCollect(int dataSizeOfCollect) {
		this.dataSizeOfCollect = dataSizeOfCollect;
	}

	public int getDataSizeOfUpload() {
		return dataSizeOfUpload;
	}

	public void setDataSizeOfUpload(int dataSizeOfUpload) {
		this.dataSizeOfUpload = dataSizeOfUpload;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCopyRight() {
		return copyRight;
	}

	public void setCopyRight(String copyRight) {
		this.copyRight = copyRight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getDataHdfsUrl() {
		return dataHdfsUrl;
	}

	public void setDataHdfsUrl(String dataHdfsUrl) {
		this.dataHdfsUrl = dataHdfsUrl;
	}

	public String getUpdateAccount() {
		return updateAccount;
	}

	public void setUpdateAccount(String updateAccount) {
		this.updateAccount = updateAccount;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createTime) {
		this.createtime = createTime;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdateTime(String updateTime) {
		this.updatetime = updatetime;
	}

	public String getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(String createAccount) {
		this.createAccount = createAccount;
	}

}
