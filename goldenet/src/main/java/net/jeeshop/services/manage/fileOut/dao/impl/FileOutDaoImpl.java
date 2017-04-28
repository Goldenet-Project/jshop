package net.jeeshop.services.manage.fileOut.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.fileOut.bean.FileOutVO;
import net.jeeshop.services.manage.fileOut.dao.FileOutDao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
/**
 * 文件上传下载数据层实现类
 * @author Yang
 *
 */
@Repository("FileOutVODaoManage")
public class FileOutDaoImpl extends SqlSessionDaoSupport implements FileOutDao {
	@Resource
	private BaseDao dao;
	
	public void setDao(BaseDao dao) {
		this.dao = dao;
	}
	
	@Override
	public int insert(FileOutVO e) {
		// TODO Auto-generated method stub
		return this.dao.insert("manage.file.insert",e);
	}

	@Override
	public int delete(FileOutVO e) {
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
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FileOutVO selectById(String id) {
		// TODO Auto-generated method stub
		return (FileOutVO) this.dao.selectOne("manage.file.selectById", id);
	}

	@Override
	public FileOutVO selectByProductId(String productId) {
		// TODO Auto-generated method stub
		SqlSession session = getSqlSession();
		return (FileOutVO) session.selectOne("manage.file.selectByProductId", productId);
	}

	@Override
	public void updateDownLoadTime(FileOutVO file) {
		// TODO Auto-generated method stub
		SqlSession session=getSqlSession();
		session.update("manage.file.updateDownLoadTime", file);
	}

	@Override
	public List<FileOutVO> selectListByProductId(String productId) {
		// TODO Auto-generated method stub
		SqlSession session=getSqlSession();
		
		return session.selectList("manage,file.selectListByProductId", productId);
	}

	@Override
	public FileOutVO selectByFileName(String fileName) {
		// TODO Auto-generated method stub
		SqlSession session=getSqlSession();
		return (FileOutVO) session.selectOne("manage,file.selectByFileName", fileName);
	}

}
