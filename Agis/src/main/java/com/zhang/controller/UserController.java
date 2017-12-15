package com.zhang.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhang.pojo.User;
import com.zhang.service.UserService;

/**
 * @author TBerg
 *
 */
@Controller
public class UserController {
	@Resource
    UserService userService;
	
	
	@RequestMapping(value = "/register.action", method = RequestMethod.POST)
	@ResponseBody
	public int isRegist(HttpServletRequest req,HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		String user_name = req.getParameter("user_name");
		String user_password=req.getParameter("user_password");
		String user_QQ=req.getParameter("user_QQ");
		int is = userService.register(user_name,user_password,user_QQ);
		System.out.println(is);
		return is;
	}
	
	
	@RequestMapping(value="/login.action",method = RequestMethod.GET)
	@ResponseBody
	public User login(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String userName = req.getParameter("user_name");
		String userPassword = req.getParameter("user_password");
	
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
				
				User user = userService.login(userName, userPassword);
				if(user!=null){
		//			String result = JSON.toJSONString(user);
		//			resp.getWriter().write(result);
				
					System.out.println(user.toString());
					return user;
				}
				
				System.out.println(user);
		
		return null;
	}
	
	@RequestMapping(value = "/name_bidui.action", method = RequestMethod.POST)
	@ResponseBody
	public int name_bidui(HttpServletRequest req,HttpServletResponse resp) {
		String user_name = req.getParameter("user_name");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(user_name);
		int re=userService.name_bidui(user_name);
		return re;
		
	}
	

	
	
}
