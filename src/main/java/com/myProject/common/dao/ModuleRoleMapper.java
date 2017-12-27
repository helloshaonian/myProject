package com.myProject.common.dao;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.myProject.common.model.ModuleRole;

/**
 * @description  --dao层接口
 * @author wangyanfei
 * @Date:2017-12-11 15:10:58
 */
@Repository
public interface ModuleRoleMapper {

	/**
	 * @Description:根据主键查询
	 * @param id 主键
	 * @return 实体
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:58
	 */	
	ModuleRole selectByPrimaryKey(Long id);
	
	/**
	 * @Description:根据例子查询
	 * @param vo 查询对象
	 * @return map集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:58
	 */	
	List<HashMap<String, Object>> selectByExample(ModuleRole vo);
	
	/**
	 * @Description:根据例子查询
	 * @param vo 查询对象
	 * @return 实体集合
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:58
	 */	
	List<ModuleRole> selectModelByExample(ModuleRole vo);
	
	/**
	 * @Description:插入一条记录
	 * @param record 插入对象（必须有主键）
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:58
	 */	
    int insert(ModuleRole record);
    
  	/**
	 * @Description:插入多条记录
	 * @param list 插入对象（必须有主键）
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:58
	 */	
    int insertModels(List list);
    
    
   /**
	 * @Description:更新一条记录
	 * @param record 更新对象（必须有主键）
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:58
	 */	
    int update(ModuleRole record);
    
    /**
	 * @Description:更新多条记录
	 * @param list 更新对象（必须有主键）
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:58
	 */	
    int update(List list);
    
    
   	/**
	 * @Description:删除一条记录
	 * @param id 删除的记录的主键
	 * @return 受影响的条数
	 * @author:wangyanfei
	 * @Date:2017-12-11 15:10:58
	 */	
    int deleteByPrimaryKey(Long id);
 }