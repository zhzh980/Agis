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

import com.zhang.pojo.Gap;
import com.zhang.pojo.marker;
import com.zhang.service.markerService;
@Controller
public class markerController {
	@Resource
	markerService markerService;
	@RequestMapping(value="/getmarker.action",method = RequestMethod.GET)
	@ResponseBody
	public List<marker> login(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		List<marker> list = markerService.getmarker();
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		
		if(list!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			for (marker marker : list) {
				System.out.println(marker.toString());
			}
			return list;
			
		}
		System.out.println(list);
		return null;
	}
	
	@RequestMapping(value="/getGap.action",method = RequestMethod.GET)
	@ResponseBody
	public List<Gap> getga(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		List<Gap> gaplist = markerService.getGap();
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		
		if(gaplist!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			for (Gap Gap : gaplist) {
				System.out.println(Gap.toString());
			}
			return gaplist;
			
		}
		System.out.println(gaplist);
		return null;
	}
	
	@RequestMapping(value="/getGap_month.action",method = RequestMethod.GET)
	@ResponseBody
	public List<Gap> getga2(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		
		resp.setHeader("Access-Control-Allow-Origin", "*");
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
		List<Gap> gaplist = markerService.getGap_month(start_time,end_time);
		
		if(gaplist!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			for (Gap Gap : gaplist) {
				System.out.println(Gap.toString());
			}
			return gaplist;
			
		}
		System.out.println(gaplist);
		return null;
	}
	
	@RequestMapping(value="/getGap_week.action",method = RequestMethod.GET)
	@ResponseBody
	public List<Gap> getga3(HttpServletResponse resp ,HttpServletRequest req) throws IOException{
		
		resp.setHeader("Access-Control-Allow-Origin", "*");
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
			start_time=year+"-"+month+"-"+"0"+(today-6)+" 00:00:00";
		}
		else{
			start_time=year+"-"+month+"-"+(today-6)+" 00:00:00";
		}
		if(today<10){
			end_time=year+"-"+month+"-"+"0"+today+" 23:59:59";
		}
		else{
			end_time=year+"-"+month+"-"+today+" 23:59:59";
		}
		
		List<Gap> gaplist = markerService.getGap_week(start_time,end_time);
		
		if(gaplist!=null){
//			String result = JSON.toJSONString(user);
//			resp.getWriter().write(result);
			for (Gap Gap : gaplist) {
				System.out.println(Gap.toString());
			}
			return gaplist;
			
		}
		System.out.println(gaplist);
		return null;
	}
}
