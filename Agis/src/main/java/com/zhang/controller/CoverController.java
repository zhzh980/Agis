package com.zhang.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhang.pojo.Cover;
import com.zhang.service.CoverService;


@Controller
public class CoverController {
	@Resource
	CoverService CoverService;
	@RequestMapping(value="/getCover.action",method = RequestMethod.GET)
	@ResponseBody
	public List<Cover> login(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		List<Cover> lists = CoverService.getCover();
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		
		if(lists!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			for (Cover Cover : lists) {
				System.out.println(Cover.toString());
			}
			return lists;
			
		}
		System.out.println(lists);
		return null;
	}
}
