package net.jeeshop.services.manage.fileOut;

import java.util.List;

import net.jeeshop.core.Services;
import net.jeeshop.services.manage.fileOut.bean.FileOutVO;
/**
 * 文件上传下载逻辑层 
 * @author Yang
 *
 */
public interface FileOutService extends Services<FileOutVO>{
	
	/**
	 * 
	* @param
	* @Description: TODO(根据传入的产品id查询相关的数据文件 信息) 
	* @author yc
	* @date 2017年4月21日 下午3:30:56 
	* @return FileOutVO    返回类型 
	* @throws
	 */
	public FileOutVO selectByProductId(String productId);
	
	/**
	 * 
	* @param
	* @Description: TODO(修改下载的时间) 
	* @author yc
	* @date 2017年4月21日 下午4:56:38 
	* @return void    返回类型 
	* @throws
	 */
	public void updateDownLoadTime(FileOutVO file);
	
	/**
	 * 
	* @param
	* @Description: TODO(根据产品id查询绑定的所有数据文件) 
	* @author yc
	* @date 2017年4月24日 下午2:52:49 
	* @return List<FileOutVO>    返回类型 
	* @throws
	 */
	public List<FileOutVO> selectListByProductId(String productId);
	
	/**
	 * 
	* @param
	* @Description: TODO(根据文件名称查询文件数据，判断是否有上传) 
	* @author yc
	* @date 2017年4月24日 下午5:16:17 
	* @return FileOutVO    返回类型 
	* @throws
	 */
	public FileOutVO selectByFileName(FileOutVO file);
}
