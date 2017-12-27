package com.myProject.common.service;

import java.util.HashMap;
import java.util.List;

import com.myProject.common.model.Module;

/**
 *@Description： Servcie
 *@Author：wangyanfei
 *@Date:2017-12-11 15:10:44
 */
public interface ModuleService {
	
	/**
	 * @Description:按条件查询
	 * @param vo 查询对象
	 * @return map集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:44
	 */	
	public List<HashMap<String, Object>> selectByExample(Module vo);
	
	/**
	 * @Description:按条件查询实体
	 * @param vo 查询对象
	 * @return 实体集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:44
	 */	
	public List<Module> selectModelByExample(Module record);
	
	/**
	 * @Description:根据主键查询
	 * @param id 主键
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:44
	 */
	public Module selectByPrimaryKey(Long id);
	
	/**
	 * @Description:更新一条记录
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:44
	 */
	public int updateByPrimaryKey(Module record);
	
	/**
	 * @Description:更新一条记录
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:44
	 */
	public int insert(Module record);
	
	
	/**
	 * @Description:批量插入
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:44
	 */
	public void insertModels(List<Module> list);
	
	
	/**
	 * @Description:删除一条记录
	 * @param id 主键
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:44
	 */
	public int deleteByPrimaryKey(Long id);
	
}
