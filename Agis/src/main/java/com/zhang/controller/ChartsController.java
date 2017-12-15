package com.zhang.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;










import com.zhang.pojo.cNChart;
import com.zhang.pojo.pHChart;
import com.zhang.pojo.tempChart;
import com.zhang.pojo.waterChart;
import com.zhang.pojo.waterChart;
import com.zhang.service.ChartsService;

@Controller
public class ChartsController {
	@Resource
	ChartsService chartsService;
	@RequestMapping(value="/getpHchart.action",method = RequestMethod.GET)
	@ResponseBody
	public List<pHChart> login(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		String month;
		String year;
		if(mounth<10){
			month="0"+mounth;
		}else{
			month=mounth+"";
		}
		year=yea+"";
		String start_time=year+"-"+month+"-"+"01";
		String end_time=year+"-"+month+"-"+"31";
		List<pHChart> gi =  chartsService.getpHchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getpHchart_season.action",method = RequestMethod.GET)
	@ResponseBody
	public List<pHChart> login6(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		
		String start_time;
		String end_time;
		if(mounth<3){
			start_time=yea-1+"-"+(12+mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else if(mounth>=3&&mounth<10)
		{
			start_time=yea+"-"+"0"+(mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else{
			start_time=yea+"-"+(mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}
	  System.out.println(start_time+"---"+end_time);
		List<pHChart> gi =  chartsService.getpHchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getpHchart_halfyear.action",method = RequestMethod.GET)
	@ResponseBody
	public List<pHChart> login7(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		
		String start_time;
		String end_time;
		if(mounth<6){
			start_time=yea-1+"-"+(12+mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else if(mounth>=6&&mounth<10)
		{
			start_time=yea+"-"+"0"+(mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else{
			start_time=yea+"-"+(mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}
	  
		List<pHChart> gi =  chartsService.getpHchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getcNchart.action",method = RequestMethod.GET)
	@ResponseBody
	public List<cNChart> login2(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point+"---");
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		String month;
		String year;
		if(mounth<10){
			month="0"+mounth;
		}else{
			month=mounth+"";
		}
		year=yea+"";
		String start_time=year+"-"+month+"-"+"01";
		String end_time=year+"-"+month+"-"+"31";
		
		List<cNChart> gi =  chartsService.getcNchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getcNchart_season.action",method = RequestMethod.GET)
	@ResponseBody
	public List<cNChart> login66(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		
		String start_time;
		String end_time;
		if(mounth<3){
			start_time=yea-1+"-"+(12+mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else if(mounth>=3&&mounth<10)
		{
			start_time=yea+"-"+"0"+(mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else{
			start_time=yea+"-"+(mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}
	  System.out.println(start_time+"---"+end_time);
		List<cNChart> gi =  chartsService.getcNchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getcNchart_halfyear.action",method = RequestMethod.GET)
	@ResponseBody
	public List<cNChart> login796(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		
		String start_time;
		String end_time;
		if(mounth<6){
			start_time=yea-1+"-"+(12+mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else if(mounth>=6&&mounth<10)
		{
			start_time=yea+"-"+"0"+(mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else{
			start_time=yea+"-"+(mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}
	  
		List<cNChart> gi =  chartsService.getcNchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getwaterchart.action",method = RequestMethod.GET)
	@ResponseBody
	public List<waterChart> login3(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		String month;
		String year;
		if(mounth<10){
			month="0"+mounth;
		}else{
			month=mounth+"";
		}
		year=yea+"";
		String start_time=year+"-"+month+"-"+"01";
		String end_time=year+"-"+month+"-"+"31";
		List<waterChart> gi =  chartsService.getwaterchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getwaterchart_season.action",method = RequestMethod.GET)
	@ResponseBody
	public List<waterChart> login78(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		
		String start_time;
		String end_time;
		if(mounth<3){
			start_time=yea-1+"-"+(12+mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else if(mounth>=3&&mounth<10)
		{
			start_time=yea+"-"+"0"+(mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else{
			start_time=yea+"-"+(mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}
	  System.out.println(start_time+"---"+end_time);
		List<waterChart> gi =  chartsService.getwaterchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/getwaterchart_halfyear.action",method = RequestMethod.GET)
	@ResponseBody
	public List<waterChart> login79(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		
		String start_time;
		String end_time;
		if(mounth<6){
			start_time=yea-1+"-"+(12+mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else if(mounth>=6&&mounth<10)
		{
			start_time=yea+"-"+"0"+(mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else{
			start_time=yea+"-"+(mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}
	  
		List<waterChart> gi =  chartsService.getwaterchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/gettempchart.action",method = RequestMethod.GET)
	@ResponseBody
	public List<tempChart> login35(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		String month;
		String year;
		if(mounth<10){
			month="0"+mounth;
		}else{
			month=mounth+"";
		}
		year=yea+"";
		String start_time=year+"-"+month+"-"+"01";
		String end_time=year+"-"+month+"-"+"31";
		List<tempChart> gi =  chartsService.gettempchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/gettempchart_season.action",method = RequestMethod.GET)
	@ResponseBody
	public List<tempChart> login795(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		
		String start_time;
		String end_time;
		if(mounth<3){
			start_time=yea-1+"-"+(12+mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else if(mounth>=3&&mounth<10)
		{
			start_time=yea+"-"+"0"+(mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else{
			start_time=yea+"-"+(mounth-2)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}
	  System.out.println(start_time+"---"+end_time);
		List<tempChart> gi =  chartsService.gettempchart(point,start_time,end_time);
		if(gi!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			System.out.println(gi.toString());
			return gi;
		}
		System.out.println(gi);
		return null;
	}
	
	@RequestMapping(value="/gettempchart_halfyear.action",method = RequestMethod.GET)
	@ResponseBody
	public List<tempChart> login88(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		String point = req.getParameter("point");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(point);
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		
		String start_time;
		String end_time;
		if(mounth<6){
			start_time=yea-1+"-"+(12+mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else if(mounth>=6&&mounth<10)
		{
			start_time=yea+"-"+"0"+(mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}else{
			start_time=yea+"-"+(mounth-5)+"-"+"01";
			end_time=yea+"-"+"0"+mounth+"-"+"31";
		}
	  
		List<tempChart> gi =  chartsService.gettempchart(point,start_time,end_time);
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
