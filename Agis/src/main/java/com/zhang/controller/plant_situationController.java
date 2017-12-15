package com.zhang.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



import com.zhang.pojo.kp_cure;
import com.zhang.pojo.plant_situation;
import com.zhang.service.plant_situationService;


@Controller
public class plant_situationController {
	@Resource
	plant_situationService plant_situationService;
	@RequestMapping(value="/getmessages.action",method = RequestMethod.GET)
	@ResponseBody
	public plant_situation login(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		plant_situation gi =  plant_situationService.getmessages(point);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getcure.action",method = RequestMethod.GET)
	@ResponseBody
	public kp_cure logins(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		resp.setHeader("Access-Control-Allow-Origin", "*");
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println("苗情："+id);
		kp_cure gi =  plant_situationService.getcure(id);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	
}
