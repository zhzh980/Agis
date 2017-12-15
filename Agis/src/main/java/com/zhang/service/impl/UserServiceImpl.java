package com.zhang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.dao.UserMapper;
import com.zhang.pojo.User;
import com.zhang.service.UserService;

/**
 * @author 
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired(required = false)
    private UserMapper userDao;
	/* (non-Javadoc)
	 * @see com.zhang.service.UserService#insert(com.zhang.pojo.User)
	 */

	/* (non-Javadoc)
	 * @see com.zhang.service.UserService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String user_name, String user_password) {
		// TODO Auto-generated method stub
		return userDao.login(user_name, user_password);
	}
	/* (non-Javadoc)
	 * @see com.zhang.service.UserService#isRegist(java.lang.String)
	 */
	@Override
	public int register(String user_name,String user_password,String user_QQ) {
		// TODO Auto-generated method stub
		return userDao.register(user_name,user_password,user_QQ);
	}
	/* (non-Javadoc)
	 * @see com.zhang.service.UserService#updatePass(java.lang.String)
	 */
	@Override
	public int name_bidui(String name) {
		// TODO Auto-generated method stub
		return userDao.name_bidui(name);
		
	}
	/* (non-Javadoc)
	 * @see com.zhang.service.UserService#updateUserInfo(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	

}  
