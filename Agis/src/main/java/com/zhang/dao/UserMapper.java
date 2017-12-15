package com.zhang.dao;

import com.zhang.pojo.User;

/**
 * @author AndyBerg
 *
 */
public interface UserMapper {

	
	User login(String user_name,String user_password);

	int register(String user_name, String user_password, String user_QQ);

	int name_bidui(String name);
}