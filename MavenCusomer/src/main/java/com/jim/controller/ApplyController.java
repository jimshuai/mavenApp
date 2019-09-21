package com.jim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jim.vo.UserVO;

@Controller
@RequestMapping(value="apply")
public class ApplyController {

	@RequestMapping(value="check",method=RequestMethod.POST)
	public String login(UserVO user,Model model)
	{
		 
		return "app/apply";
	}
}
