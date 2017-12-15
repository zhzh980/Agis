package com.zhang.controller;

import java.io.IOException;
import java.util.Calendar;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




import com.zhang.pojo.GdInfo;
import com.zhang.pojo.GdInfo_nu;
import com.zhang.service.GdInfoService;

@Controller

public class GdInfoController {
	
	
	@Resource
	GdInfoService gdInfoService;
	@RequestMapping(value="/getit.action",method = RequestMethod.GET)
	@ResponseBody
	public GdInfo login(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		GdInfo gi =  gdInfoService.getInfo(point);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getit2.action",method = RequestMethod.GET)
	@ResponseBody
	public GdInfo_nu login22(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		GdInfo_nu gi =  gdInfoService.getInfo2(point);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getit_month.action",method = RequestMethod.GET)
	@ResponseBody
	public GdInfo login2(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		String month;
		String year;
		System.out.println(yea+"/"+mounth);
		if(mounth<10){
			month="0"+mounth;
		}else{
			month=mounth+"";
		}
		year=yea+"";
		String start_time=year+"-"+month+"-"+"01";
		String end_time=year+"-"+month+"-"+"31";
		System.out.println(start_time + "===========" +end_time);
		GdInfo gi =  gdInfoService.getInfo_month(point, start_time, end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getit_month2.action",method = RequestMethod.GET)
	@ResponseBody
	public GdInfo_nu login23(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		String month;
		String year;
		System.out.println(yea+"/"+mounth);
		if(mounth<10){
			month="0"+mounth;
		}else{
			month=mounth+"";
		}
		year=yea+"";
		String start_time=year+"-"+month+"-"+"01";
		String end_time=year+"-"+month+"-"+"31";
		
		GdInfo_nu gi =  gdInfoService.getInfo_month2(point, start_time, end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	
	@RequestMapping(value="/getit_week.action",method = RequestMethod.GET)
	@ResponseBody
	public GdInfo login3(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		int today=now.get(Calendar.DATE);
		String month;
		String start_time;
		String end_time;
		
		System.out.println(year+"/"+mounth);
		if(mounth<10){
			month="0"+mounth;
		}else{
			month=mounth+"";
		}
		if((today-6)<10){
			start_time=year+"-"+month+"-"+"0"+(today-6)+" "+"00:00:00";
		}
		else{
			start_time=year+"-"+month+"-"+(today-6)+" "+"00:00:00";
		}
		if(today<10){
			end_time=year+"-"+month+"-"+"0"+today+" "+"23:59:58";
		}
		else{
			end_time=year+"-"+month+"-"+today+" "+"23:59:58";
		}
		System.out.println(start_time);
		System.out.println(end_time);
		
		GdInfo gi =  gdInfoService.getInfo_week(point, start_time, end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getit_week2.action",method = RequestMethod.GET)
	@ResponseBody
	public GdInfo_nu login33(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		int today=now.get(Calendar.DATE);
		String month;
		String start_time;
		String end_time;
		
		System.out.println(year+"/"+mounth);
		if(mounth<10){
			month="0"+mounth;
		}else{
			month=mounth+"";
		}
		if((today-6)<10){
			start_time=year+"-"+month+"-"+"0"+(today-6)+" "+"00:00:00";
		}
		else{
			start_time=year+"-"+month+"-"+(today-6)+" "+"00:00:00";
		}
		if(today<10){
			end_time=year+"-"+month+"-"+"0"+today+" "+"23:59:58";
		}
		else{
			end_time=year+"-"+month+"-"+today+" "+"23:59:58";
		}
		System.out.println(start_time);
		System.out.println(end_time);
		
		GdInfo_nu gi =  gdInfoService.getInfo_week2(point, start_time, end_time);
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
