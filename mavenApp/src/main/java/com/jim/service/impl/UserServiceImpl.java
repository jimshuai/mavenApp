package com.jim.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jim.service.IUserService;
import com.jim.vo.UserVO;

@Service
public class UserServiceImpl implements IUserService{

	@Override
	public UserVO getUserById(String id) {
		// TODO Auto-generated method stub
		System.out.println("mavenApp-根据id获取用户信息");
		UserVO user=new UserVO();
		user.setId("1");
		user.setName("jamse");
		user.setAge(12);
		user.setAddr("shanghai");
		return user;
	}

	@Override
	public List<UserVO> getUser(UserVO vo) {
		// TODO Auto-generated method stub
		System.out.println("mavenApp根据vo获取用户信息");
		return null;
	}

	 

}
