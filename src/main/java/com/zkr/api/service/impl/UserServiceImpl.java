package com.zkr.api.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zkr.api.dao.UserDao;
import com.zkr.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

}
