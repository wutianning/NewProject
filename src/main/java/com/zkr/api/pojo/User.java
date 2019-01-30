package com.zkr.api.pojo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class User {
	
	
	private BigDecimal userid;
	
	private String username;
	
	private String userpwd;
	
	//private String verifycode;   //验证码
	
	//private String usertel;      //电话
	

}
