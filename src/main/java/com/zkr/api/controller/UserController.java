package com.zkr.api.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zkr.api.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Resource
	private UserService userService;
	
	

}
