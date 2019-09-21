package com.jim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jim.service.IUserService;
import com.jim.vo.UserVO;

@Controller
@RequestMapping(value="user")
public class UserController {
 
	@Autowired
	IUserService iUserService;
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(UserVO user,Model model)
	{
		UserVO user0=iUserService.getUserById("1");	
		model.addAttribute("user", user0);
		
		return "/app/login";
	}
	
	@RequestMapping(value="user",method=RequestMethod.POST)
	public String user(UserVO user,Model model)
	{
		 
		return "/app/user";
	}
}