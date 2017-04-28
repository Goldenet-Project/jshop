package net.jeeshop.services.manage.fileOut.dao;

import java.util.List;

import net.jeeshop.core.DaoManager;
import net.jeeshop.services.manage.fileOut.bean.FileOutVO;
/**
 * 文件上传下载数据层接口
 * @author Yang
 *
 */
public interface FileOutDao extends DaoManager<FileOutVO>{
	/**
	 * 
	* @param
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @author yc
	* @date 2017年4月28日 上午8:54:02 
	* @return FileOutVO    返回类型 
	* @throws
	 */
	public FileOutVO selectByProductId(String productId);
	/**
	 * 
	* @param
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @author yc
	* @date 2017年4月28日 上午8:54:06 
	* @return void    返回类型 
	* @throws
	 */
	public void updateDownLoadTime(FileOutVO file);
	/**
	 * 
	* @param
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @author yc
	* @date 2017年4月28日 上午8:54:11 
	* @return List<FileOutVO>    返回类型 
	* @throws
	 */
	public List<FileOutVO> selectListByProductId(String productId);
	/**
	 * 
	* @param
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @author yc
	* @date 2017年4月28日 上午8:54:15 
	* @return FileOutVO    返回类型 
	* @throws
	 */
	public FileOutVO selectByFileName(String fileName);
}
