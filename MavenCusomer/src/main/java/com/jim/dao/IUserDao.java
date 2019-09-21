package com.jim.dao;

import java.util.List;

import com.jim.vo.UserVO;

public interface IUserDao {

	public UserVO getUserById(String id);
	
	public List<UserVO> getUser(UserVO vo);
	
	public void save(UserVO vo);
	
	public void update(UserVO vo);
	
}
