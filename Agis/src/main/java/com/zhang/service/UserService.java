package com.zhang.service;

import com.zhang.pojo.User;

/**
 * @author zihao
 *
 */
public interface UserService {  	

	public User login(String user_name,String user_password);
	
	public int register(String user_name,String user_password,String user_QQ);

	public int name_bidui(String name);
}  
