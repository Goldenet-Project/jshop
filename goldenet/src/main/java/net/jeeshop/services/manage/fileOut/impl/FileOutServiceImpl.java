package net.jeeshop.services.manage.fileOut.impl;

import java.util.List;

import javax.annotation.Resource;

import net.jeeshop.core.ServersManager;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.fileOut.FileOutService;
import net.jeeshop.services.manage.fileOut.bean.FileOutVO;
import net.jeeshop.services.manage.fileOut.dao.FileOutDao;

import org.springframework.stereotype.Service;
/**
 * 文件上传下载逻辑层实现类
 * @author Yang
 *
 */
@Service("FileOutVOSericeManage")
public class FileOutServiceImpl extends ServersManager<FileOutVO,FileOutDao> implements FileOutService {
	@Resource(name = "FileOutVODaoManage")
	@Override
	public void setDao(FileOutDao dao) {
		// TODO Auto-generated method stub
		this.dao=dao;
	}
	@Override
	public int insert(FileOutVO e) {
		// TODO Auto-generated method stub
		return this.dao.insert(e);
	}

	@Override
	public int delete(FileOutVO e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletes(String[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(FileOutVO e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FileOutVO selectOne(FileOutVO e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileOutVO selectById(String id) {
		// TODO Auto-generated method stub
		return this.dao.selectById(id);
	}

	@Override
	public PagerModel selectPageList(FileOutVO e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FileOutVO> selectList(FileOutVO e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public FileOutVO selectByProductId(String productId) {
		// TODO Auto-generated method stub
		return this.dao.selectByProductId(productId);
	}
	@Override
	public void updateDownLoadTime(FileOutVO file) {
		// TODO Auto-generated method stub
		this.dao.updateDownLoadTime(file);
	}
	@Override
	public List<FileOutVO> selectListByProductId(String productId) {
		// TODO Auto-generated method stub
		return this.dao.selectListByProductId(productId);
	}
	@Override
	public FileOutVO selectByFileName(String fileName) {
		// TODO Auto-generated method stub
		return this.dao.selectByFileName(fileName);
	}
}
