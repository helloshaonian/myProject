package com.myProject.common.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.myProject.common.model.User;

/**
 * @description  --dao层接口
 * @author wangyanfei
 * @Date:2017-12-11 15:11:24
 */
@Repository
public interface UserMapper {

	/**
	 * @Description:根据主键查询
	 * @param id 主键
	 * @return 实体
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:24
	 */	
	User selectByPrimaryKey(Long id);
	
	/**
	 * @Description:根据例子查询
	 * @param vo 查询对象
	 * @return map集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:24
	 */	
	List<HashMap<String, Object>> selectByExample(User vo);
	
	/**
	 * @Description:根据例子查询
	 * @param vo 查询对象
	 * @return 实体集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:24
	 */	
	List<User> selectModelByExample(User vo);
	
	/**
	 * @Description:插入一条记录
	 * @param record 插入对象（必须有主键）
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:24
	 */	
    int insert(User record);
    
  	/**
	 * @Description:插入多条记录
	 * @param list 插入对象（必须有主键）
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:24
	 */	
    int insertModels(List list);
    
    
   /**
	 * @Description:更新一条记录
	 * @param record 更新对象（必须有主键）
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:24
	 */	
    int update(User record);
    
    /**
	 * @Description:更新多条记录
	 * @param list 更新对象（必须有主键）
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:24
	 */	
    int update(List list);
    
    
   	/**
	 * @Description:删除一条记录
	 * @param id 删除的记录的主键
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:11:24
	 */	
    int deleteByPrimaryKey(Long id);
    
    User findByUserName(String username);
 }