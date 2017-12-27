package com.myProject.firstT.service;

import java.util.HashMap;
import java.util.List;

import com.myProject.firstT.model.Schoole;

/**
 *@Description： Servcie
 *@Author：wangyanfei
 *@Date:2017-12-04 15:31:55
 */
public interface SchooleService {
	
	/**
	 * @Description:按条件查询
	 * @param vo 查询对象
	 * @return map集合
	 * @author:wangyanfei
	 * @Date:2017-12-04 15:31:55
	 */	
	public List<HashMap<String, Object>> selectByExample(Schoole vo);
	
	/**
	 * @Description:按条件查询实体
	 * @param vo 查询对象
	 * @return 实体集合
	 * @author:wangyanfei
	 * @Date:2017-12-04 15:31:55
	 */	
	public List<Schoole> selectModelByExample(Schoole record);
	
	/**
	 * @Description:根据主键查询
	 * @param id 主键
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-04 15:31:55
	 */
	public Schoole selectByPrimaryKey(Long id);
	
	/**
	 * @Description:更新一条记录
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-04 15:31:55
	 */
	public int updateByPrimaryKey(Schoole record);
	
	/**
	 * @Description:更新一条记录
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-04 15:31:55
	 */
	public int insert(Schoole record);
	
	
	/**
	 * @Description:批量插入
	 * @param vo 记录
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-04 15:31:55
	 */
	public void insertModels(List<Schoole> list);
	
	
	/**
	 * @Description:删除一条记录
	 * @param id 主键
	 * @return 受影响的记录条数
	 * @author:wangyanfei
	 * @Date:2017-12-04 15:31:55
	 */
	public int deleteByPrimaryKey(Long id);
	
	
	public void test();
}
