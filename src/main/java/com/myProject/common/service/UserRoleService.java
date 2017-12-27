package com.myProject.common.service;

import java.util.HashMap;
import java.util.List;

import com.myProject.common.model.UserRole;

/**
 *@Description： Servcie
 *@Author：wangyanfei
 *@Date:2017-12-11 15:11:36
 */
public interface UserRoleService {
	
	/**
	 * @Description:按条件查询
	 * @param vo 查询对象
	 * @return map集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:36
	 */	
	public List<HashMap<String, Object>> selectByExample(UserRole vo);
	
	/**
	 * @Description:按条件查询实体
	 * @param vo 查询对象
	 * @return 实体集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:36
	 */	
	public List<UserRole> selectModelByExample(UserRole record);
	
	/**
	 * @Description:根据主键查询
	 * @param id 主键
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:36
	 */
	public UserRole selectByPrimaryKey(Long id);
	
	/**
	 * @Description:更新一条记录
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:36
	 */
	public int updateByPrimaryKey(UserRole record);
	
	/**
	 * @Description:更新一条记录
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:36
	 */
	public int insert(UserRole record);
	
	
	/**
	 * @Description:批量插入
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:36
	 */
	public void insertModels(List<UserRole> list);
	
	
	/**
	 * @Description:删除一条记录
	 * @param id 主键
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:36
	 */
	public int deleteByPrimaryKey(Long id);
	
}
