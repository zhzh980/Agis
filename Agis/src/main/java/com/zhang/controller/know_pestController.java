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






import com.mysql.fabric.xmlrpc.base.Data;
import com.zhang.pojo.know_pest;
import com.zhang.service.know_pestService;


@Controller
public class know_pestController {

	@Resource
	know_pestService know_pestService;
	@RequestMapping(value="/getkp_count.action",method = RequestMethod.GET)
	@ResponseBody
	public int login(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
	
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		int gi =  know_pestService.getkp_count();
		System.out.println(gi);
		return gi;
	}
	
	@RequestMapping(value="/getkp_info.action",method = RequestMethod.GET)
	@ResponseBody
	public List<know_pest> login2(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		int c = Integer.parseInt(req.getParameter("page"));
		int d = Integer.parseInt(req.getParameter("num"));
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		List<know_pest> list = know_pestService.getkp_info(c,d);
		if(list!=null){
			return list;
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="/getkp_delete.action",method = RequestMethod.GET)
	@ResponseBody
	public String login5(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		int c = Integer.parseInt(req.getParameter("id"));
		know_pestService.getkp_delete(c);
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(c);
		
		return null;
	}
	
	@RequestMapping(value="/getkp_this.action",method = RequestMethod.GET)
	@ResponseBody
	public know_pest login9(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		int c = Integer.parseInt(req.getParameter("id"));
		System.out.println("第"+c+"条记录");
		know_pest kp= know_pestService.getkp_this(c);
		resp.setHeader("Access-Control-Allow-Origin", "*");
		if(kp!=null){
			return kp;
		}
		
		return null;
	}
	
	@RequestMapping(value="/getkp_insert.action",method = RequestMethod.POST)
	@ResponseBody
	public know_pest login10(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		resp.setCharacterEncoding("utf-8");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		String crop = req.getParameter("crop");
		String disease_name = req.getParameter("disease_name");
		String disease_chara = req.getParameter("disease_chara");
		String growth = req.getParameter("growth");
		String cure_treat = req.getParameter("cure_treat");
		System.out.println(crop+"-"+disease_name+"-"+disease_chara+"-"+cure_treat);
		know_pestService.getkp_insert(crop,disease_name,disease_chara,growth,cure_treat);
	
		
		
		return null;
	}
	
	@RequestMapping(value="/getkp_update.action",method = RequestMethod.POST)
	@ResponseBody
	public int login101(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		resp.setCharacterEncoding("utf-8");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		int id = Integer.parseInt(req.getParameter("id"));		
		String crop = req.getParameter("crop");
		String disease_name = req.getParameter("disease_name");
		String disease_chara = req.getParameter("disease_chara");
		String growth = req.getParameter("growth");
		String cure_treat = req.getParameter("cure_treat");
		System.out.println(id+"-"+disease_name+"-"+disease_chara+"-"+growth+"-"+cure_treat);
		know_pestService.getkp_update(id,crop,disease_name,disease_chara,growth,cure_treat);
		
		
		
		return 1;
	}
	
	@RequestMapping(value="/set_gi.action",method = RequestMethod.POST)
	@ResponseBody
	public int login3(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		float swater=Float.parseFloat(req.getParameter("swater"));
		float scN=Float.parseFloat(req.getParameter("scN"));
		float scP=Float.parseFloat(req.getParameter("scP"));
		float scK=Float.parseFloat(req.getParameter("scK"));
		float spH=Float.parseFloat(req.getParameter("spH"));
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		
		return know_pestService.set_gi(point,swater,scN,scP,scK,spH);
		
		
	}
}
