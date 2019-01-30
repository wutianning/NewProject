package com.zkr.api.pojo;

import lombok.Data;

@Data
public class User {
	
	private String username;
	
	private String userpwd;
	
	private String verifycode;   //验证码
	
	private String usertel;      //电话
	

}
