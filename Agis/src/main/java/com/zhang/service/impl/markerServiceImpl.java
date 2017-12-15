package com.zhang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.dao.markerMapper;
import com.zhang.pojo.Gap;
import com.zhang.pojo.marker;
import com.zhang.service.markerService;

@Service
public class markerServiceImpl implements markerService{
	@Autowired(required = false)
	private markerMapper markerDao;

	@Override
	public List<marker> getmarker() {
		// TODO Auto-generated method stub
		return markerDao.getmarker();
	}

	@Override
	public List<Gap> getGap() {
		// TODO Auto-generated method stub
		List<Gap> gap = markerDao.getGap();
		for(Gap gap1 : gap) {

			float i = gap1.getWater()-gap1.getSwater();
			if(-1<i&&i<1){
				gap1.setWater_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setWater_stu("orange");
				
			}
			else if(i>=2){
				gap1.setWater_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setWater_stu("gray");
				
			}
			else{
				gap1.setWater_stu("black");
				
			}
			
			i=gap1.getcK()-gap1.getScK();
			if(-1<i&&i<1){
				gap1.setcK_stu("blue");
			
			}
			else if(i>=1&&i<2){
				gap1.setcK_stu("orange");
			
			}
			else if(i>=2){
				gap1.setcK_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setcK_stu("gray");
				
			}
			else{
				gap1.setcK_stu("black");
				
			}
			
			i=gap1.getcN()-gap1.getScN();
			if(-1<i&&i<1){
				gap1.setcN_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setcN_stu("orange");
			
			}
			else if(i>=2){
				gap1.setcN_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setcN_stu("gray");
				
			}
			else{
				gap1.setcN_stu("black");
				
			}
			i=gap1.getcP()-gap1.getScP();
			if(-1<i&&i<1){
				gap1.setcP_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setcP_stu("orange");
				
			}
			else if(i>=2){
				gap1.setcP_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setcP_stu("gray");
				
			}
			else{
				gap1.setcP_stu("black");
				
			}
			i=gap1.getpH()-gap1.getSpH();
			if(-1<i&&i<1){
				gap1.setpH_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setpH_stu("orange");
			
			}
			else if(i>=2){
				gap1.setpH_stu("red");
			
			}
			else if(i<=-1&&i>-2){
				gap1.setpH_stu("gray");
			
			}
			else{
				gap1.setpH_stu("black");
				
			}
		}
		return gap;
	}
	
	@Override
	public List<Gap> getGap_month(String start_time,String end_time) {
		// TODO Auto-generated method stub
		List<Gap> gap = markerDao.getGap_month(start_time,end_time);
		for(Gap gap1 : gap) {

			float i = gap1.getWater()-gap1.getSwater();
			if(-1<i&&i<1){
				gap1.setWater_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setWater_stu("orange");
				
			}
			else if(i>=2){
				gap1.setWater_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setWater_stu("gray");
				
			}
			else{
				gap1.setWater_stu("black");
				
			}
			
			i=gap1.getcK()-gap1.getScK();
			if(-1<i&&i<1){
				gap1.setcK_stu("blue");
			
			}
			else if(i>=1&&i<2){
				gap1.setcK_stu("orange");
			
			}
			else if(i>=2){
				gap1.setcK_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setcK_stu("gray");
				
			}
			else{
				gap1.setcK_stu("black");
				
			}
			
			i=gap1.getcN()-gap1.getScN();
			if(-1<i&&i<1){
				gap1.setcN_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setcN_stu("orange");
			
			}
			else if(i>=2){
				gap1.setcN_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setcN_stu("gray");
				
			}
			else{
				gap1.setcN_stu("black");
				
			}
			i=gap1.getcP()-gap1.getScP();
			if(-1<i&&i<1){
				gap1.setcP_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setcP_stu("orange");
				
			}
			else if(i>=2){
				gap1.setcP_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setcP_stu("gray");
				
			}
			else{
				gap1.setcP_stu("black");
				
			}
			i=gap1.getpH()-gap1.getSpH();
			if(-1<i&&i<1){
				gap1.setpH_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setpH_stu("orange");
			
			}
			else if(i>=2){
				gap1.setpH_stu("red");
			
			}
			else if(i<=-1&&i>-2){
				gap1.setpH_stu("gray");
			
			}
			else{
				gap1.setpH_stu("black");
				
			}
		}
		return gap;
	}
	
	@Override
	public List<Gap> getGap_week(String start_time,String end_time) {
		// TODO Auto-generated method stub
		List<Gap> gap = markerDao.getGap_week(start_time,end_time);
		for(Gap gap1 : gap) {

			float i = gap1.getWater()-gap1.getSwater();
			if(-1<i&&i<1){
				gap1.setWater_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setWater_stu("orange");
				
			}
			else if(i>=2){
				gap1.setWater_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setWater_stu("gray");
				
			}
			else{
				gap1.setWater_stu("black");
				
			}
			
			i=gap1.getcK()-gap1.getScK();
			if(-1<i&&i<1){
				gap1.setcK_stu("blue");
			
			}
			else if(i>=1&&i<2){
				gap1.setcK_stu("orange");
			
			}
			else if(i>=2){
				gap1.setcK_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setcK_stu("gray");
				
			}
			else{
				gap1.setcK_stu("black");
				
			}
			
			i=gap1.getcN()-gap1.getScN();
			if(-1<i&&i<1){
				gap1.setcN_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setcN_stu("orange");
			
			}
			else if(i>=2){
				gap1.setcN_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setcN_stu("gray");
				
			}
			else{
				gap1.setcN_stu("black");
				
			}
			i=gap1.getcP()-gap1.getScP();
			if(-1<i&&i<1){
				gap1.setcP_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setcP_stu("orange");
				
			}
			else if(i>=2){
				gap1.setcP_stu("red");
				
			}
			else if(i<=-1&&i>-2){
				gap1.setcP_stu("gray");
				
			}
			else{
				gap1.setcP_stu("black");
				
			}
			i=gap1.getpH()-gap1.getSpH();
			if(-1<i&&i<1){
				gap1.setpH_stu("blue");
				
			}
			else if(i>=1&&i<2){
				gap1.setpH_stu("orange");
			
			}
			else if(i>=2){
				gap1.setpH_stu("red");
			
			}
			else if(i<=-1&&i>-2){
				gap1.setpH_stu("gray");
			
			}
			else{
				gap1.setpH_stu("black");
				
			}
		}
		return gap;
	}
}


