package com.myProject.firstT.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myProject.common.model.User;
import com.myProject.common.service.UserService;
import com.myProject.firstT.service.SchooleService;
import com.myProject.firstT.model.Schoole;
import com.myProject.firstT.dao.SchooleMapper;


/**
 *@Description： Servcie实现类
 *@Author：wangyanfei
 */
@Service
@Transactional
public class SchooleServiceImpl implements SchooleService{

	@Autowired
	private SchooleMapper SchooleMapper;//
	
	@Autowired
	UserService userService;
	@Override
	public List<HashMap<String, Object>> selectByExample(Schoole vo) {
		return SchooleMapper.selectByExample(vo);
	}

	@Override
	public List<Schoole> selectModelByExample(Schoole vo) {
		return SchooleMapper.selectModelByExample(vo);
	}
	
	
	@Override
	public Schoole selectByPrimaryKey(Long id) {
		return SchooleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Schoole vo)  {
		if(vo.getId()==null){
			System.err.println("更新错误，无主键id");
		}
		return SchooleMapper.update(vo);
	}

	@Override
	public int insert(Schoole vo) {
		int i=SchooleMapper.insert(vo);
		  System.out.println(vo.getId());
		  return i;
	}
	
	@Override
	public void insertModels(List<Schoole> list){
			SchooleMapper.insertModels(list);
	}
	
	
	@Override
	public int deleteByPrimaryKey(Long id){
		return  SchooleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void test() {
			User u=new User();
			u.setUsername("adbadf");
				try {
					userService.insert(u);
				} catch (Exception e) {
					e.printStackTrace();
				}
		//throw new RuntimeException();
	}
	
}
