package com.jim.service;

import java.util.List;

import com.jim.vo.UserVO;

public interface IUserService {

	public UserVO getUserById(String id);
	
	public List<UserVO> getUser(UserVO vo);
	
	 
	
}
