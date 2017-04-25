package net.jeeshop.services.manage.fileOut.dao;

import java.util.List;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.manage.fileOut.bean.FileOutVO;

public interface FileOutDao extends DaoManager<FileOutVO>{

	public FileOutVO selectByProductId(String productId);
	public void updateDownLoadTime(FileOutVO file);
	public List<FileOutVO> selectListByProductId(String productId);
	public FileOutVO selectByFileName(String fileName);
}
