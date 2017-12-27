package com.myProject.common.service;

import java.util.HashMap;
import java.util.List;

import com.myProject.common.model.Role;

/**
 *@Description： Servcie
 *@Author：wangyanfei
 *@Date:2017-12-11 15:11:10
 */
public interface RoleService {
	
	/**
	 * @Description:按条件查询
	 * @param vo 查询对象
	 * @return map集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:10
	 */	
	public List<HashMap<String, Object>> selectByExample(Role vo);
	
	/**
	 * @Description:按条件查询实体
	 * @param vo 查询对象
	 * @return 实体集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:10
	 */	
	public List<Role> selectModelByExample(Role record);
	
	/**
	 * @Description:根据主键查询
	 * @param id 主键
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:10
	 */
	public Role selectByPrimaryKey(Long id);
	
	/**
	 * @Description:更新一条记录
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:10
	 */
	public int updateByPrimaryKey(Role record);
	
	/**
	 * @Description:更新一条记录
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:10
	 */
	public int insert(Role record);
	
	
	/**
	 * @Description:批量插入
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:10
	 */
	public void insertModels(List<Role> list);
	
	
	/**
	 * @Description:删除一条记录
	 * @param id 主键
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:10
	 */
	public int deleteByPrimaryKey(Long id);
	
	public void test();
	
}
