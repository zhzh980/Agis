package com.zhang.service.impl;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.dao.GdInfoMapper;
import com.zhang.pojo.GdInfo;
import com.zhang.pojo.GdInfo_nu;
import com.zhang.service.GdInfoService;
@Service
public class GdInfoServiceImpl implements GdInfoService{
    @Autowired(required=false)
    private GdInfoMapper GdInDao;

	@Override
	public GdInfo getInfo(String point) {
		// TODO Auto-generated method stub
		
		GdInfo gap1 = GdInDao.getInfo(point);
		

		float i = gap1.getWater()-gap1.getSwater();
		if(-1<i&&i<1){
			gap1.setWater_stu("blue");
			gap1.setSug_water("保持水分");
		}
		else if(i>=1&&i<2){
			gap1.setWater_stu("orange");
			gap1.setSug_water("停止灌溉");
		}
		else if(i>=2){
			gap1.setWater_stu("red");
			gap1.setSug_water("停止灌溉");
		}
		else if(i<=-1&&i>-2){
			gap1.setWater_stu("gray");
			gap1.setSug_water("合理滴灌");
		}
		else{
			gap1.setWater_stu("black");
			gap1.setSug_water("合理喷灌");
		}
		
		
		i=gap1.getpH()-gap1.getSpH();
		if(-1<i&&i<1){
			gap1.setpH_stu("blue");
			gap1.setSug_pH("保持pH");
		}
		else if(i>=1&&i<2){
			gap1.setpH_stu("orange");
			gap1.setSug_pH("降低pH");
		}
		else if(i>=2){
			gap1.setpH_stu("red");
			gap1.setSug_pH("降低pH");
		}
		else if(i<=-1&&i>-2){
			gap1.setpH_stu("gray");
			gap1.setSug_pH("追加石灰");
		}
		else{
			gap1.setpH_stu("black");
			gap1.setSug_pH("追加石灰");
		}
	
	return gap1;

   }
	
	@Override
	public GdInfo_nu getInfo2(String point) {
		// TODO Auto-generated method stub
		
		GdInfo_nu gap1 = GdInDao.getInfo2(point);
		
		float i;
		i=gap1.getcK()-gap1.getScK();
		if(-1<i&&i<1){
			gap1.setcK_stu("blue");
			gap1.setSug_cK("保持含量");
		}
		else if(i>=1&&i<2){
			gap1.setcK_stu("orange");
			gap1.setSug_cK("减少钾含量");
		}
		else if(i>=2){
			gap1.setcK_stu("red");
			gap1.setSug_cK("减少钾含量");
		}
		else if(i<=-1&&i>-2){
			gap1.setcK_stu("gray");
			gap1.setSug_cK("追加钾肥");
		}
		else{
			gap1.setcK_stu("black");
			gap1.setSug_cK("追加钾肥");
		}
		
		i=gap1.getcN()-gap1.getScN();
		if(-1<i&&i<1){
			gap1.setcN_stu("blue");
			gap1.setSug_cN("保持氮含量");
		}
		else if(i>=1&&i<2){
			gap1.setcN_stu("orange");
			gap1.setSug_cN("减少氮含量");
		}
		else if(i>=2){
			gap1.setcN_stu("red");
			gap1.setSug_cN("减少氮含量");
		}
		else if(i<=-1&&i>-2){
			gap1.setcN_stu("gray");
			gap1.setSug_cN("追加氮肥");
		}
		else{
			gap1.setcN_stu("black");
			gap1.setSug_cN("追加氮肥");
		}
		i=gap1.getcP()-gap1.getScP();
		if(-1<i&&i<1){
			gap1.setcP_stu("blue");
			gap1.setSug_cP("保持磷含量");
		}
		else if(i>=1&&i<2){
			gap1.setcP_stu("orange");
			gap1.setSug_cP("减少磷含量");
		}
		else if(i>=2){
			gap1.setcP_stu("red");
			gap1.setSug_cP("减少磷含量");
		}
		else if(i<=-1&&i>-2){
			gap1.setcP_stu("gray");
			gap1.setSug_cP("追加磷肥");
		}
		else{
			gap1.setcP_stu("black");
			gap1.setSug_cP("追加磷肥");
		}
	
	return gap1;
	

   }	
	
	
	@Override
	public GdInfo getInfo_month(String point,String start_time,String end_time) {
		GdInfo gap2=GdInDao.getInfo_month(point,start_time,end_time);
		float i = gap2.getWater()-gap2.getSwater();
		if(-1<i&&i<1){
			gap2.setWater_stu("blue");
			gap2.setSug_water("保持水分");
		}
		else if(i>=1&&i<2){
			gap2.setWater_stu("orange");
			gap2.setSug_water("停止灌溉");
		}
		else if(i>=2){
			gap2.setWater_stu("red");
			gap2.setSug_water("停止灌溉");
		}
		else if(i<=-1&&i>-2){
			gap2.setWater_stu("gray");
			gap2.setSug_water("合理滴灌");
		}
		else{
			gap2.setWater_stu("black");
			gap2.setSug_water("合理喷灌");
		}
		
		i=gap2.getpH()-gap2.getSpH();
		if(-1<i&&i<1){
			gap2.setpH_stu("blue");
			gap2.setSug_pH("保持pH");
		}
		else if(i>=1&&i<2){
			gap2.setpH_stu("orange");
			gap2.setSug_pH("降低pH");
		}
		else if(i>=2){
			gap2.setpH_stu("red");
			gap2.setSug_pH("降低pH");
		}
		else if(i<=-1&&i>-2){
			gap2.setpH_stu("gray");
			gap2.setSug_pH("追加石灰");
		}
		else{
			gap2.setpH_stu("black");
			gap2.setSug_pH("追加石灰");
		}
		Calendar now=Calendar.getInstance();
		int yea=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		gap2.setG_time(yea+"-"+mounth);
	
	return gap2;
	}
	
	@Override
	public GdInfo_nu getInfo_month2(String point,String start_time,String end_time) {
		GdInfo_nu gap2=GdInDao.getInfo_month2(point,start_time,end_time);
		float i ;
		
		i=gap2.getcK()-gap2.getScK();
		if(-1<i&&i<1){
			gap2.setcK_stu("blue");
			gap2.setSug_cK("保持含量");
		}
		else if(i>=1&&i<2){
			gap2.setcK_stu("orange");
			gap2.setSug_cK("减少钾含量");
		}
		else if(i>=2){
			gap2.setcK_stu("red");
			gap2.setSug_cK("减少钾含量");
		}
		else if(i<=-1&&i>-2){
			gap2.setcK_stu("gray");
			gap2.setSug_cK("追加钾肥");
		}
		else{
			gap2.setcK_stu("black");
			gap2.setSug_cK("追加钾肥");
		}
		
		i=gap2.getcN()-gap2.getScN();
		if(-1<i&&i<1){
			gap2.setcN_stu("blue");
			gap2.setSug_cN("保持氮含量");
		}
		else if(i>=1&&i<2){
			gap2.setcN_stu("orange");
			gap2.setSug_cN("减少氮含量");
		}
		else if(i>=2){
			gap2.setcN_stu("red");
			gap2.setSug_cN("减少氮含量");
		}
		else if(i<=-1&&i>-2){
			gap2.setcN_stu("gray");
			gap2.setSug_cN("追加氮肥");
		}
		else{
			gap2.setcN_stu("black");
			gap2.setSug_cN("追加氮肥");
		}
		i=gap2.getcP()-gap2.getScP();
		if(-1<i&&i<1){
			gap2.setcP_stu("blue");
			gap2.setSug_cP("保持磷含量");
		}
		else if(i>=1&&i<2){
			gap2.setcP_stu("orange");
			gap2.setSug_cP("减少磷含量");
		}
		else if(i>=2){
			gap2.setcP_stu("red");
			gap2.setSug_cP("减少磷含量");
		}
		else if(i<=-1&&i>-2){
			gap2.setcP_stu("gray");
			gap2.setSug_cP("追加磷肥");
		}
		else{
			gap2.setcP_stu("black");
			gap2.setSug_cP("追加磷肥");
		}
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		gap2.setNu_time(year+"-"+mounth);
	
	return gap2;
	}
	
	@Override
	public GdInfo getInfo_week(String point,String start_time,String end_time) {
		GdInfo gap2=GdInDao.getInfo_week(point,start_time,end_time);
		float i = gap2.getWater()-gap2.getSwater();
		if(-1<i&&i<1){
			gap2.setWater_stu("blue");
			gap2.setSug_water("保持水分");
		}
		else if(i>=1&&i<2){
			gap2.setWater_stu("orange");
			gap2.setSug_water("停止灌溉");
		}
		else if(i>=2){
			gap2.setWater_stu("red");
			gap2.setSug_water("停止灌溉");
		}
		else if(i<=-1&&i>-2){
			gap2.setWater_stu("gray");
			gap2.setSug_water("合理滴灌");
		}
		else{
			gap2.setWater_stu("black");
			gap2.setSug_water("合理喷灌");
		}
		
		i=gap2.getpH()-gap2.getSpH();
		if(-1<i&&i<1){
			gap2.setpH_stu("blue");
			gap2.setSug_pH("保持pH");
		}
		else if(i>=1&&i<2){
			gap2.setpH_stu("orange");
			gap2.setSug_pH("降低pH");
		}
		else if(i>=2){
			gap2.setpH_stu("red");
			gap2.setSug_pH("降低pH");
		}
		else if(i<=-1&&i>-2){
			gap2.setpH_stu("gray");
			gap2.setSug_pH("追加石灰");
		}
		else{
			gap2.setpH_stu("black");
			gap2.setSug_pH("追加石灰");
		}
		
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		int today=now.get(Calendar.DATE);
		gap2.setG_time(year+"-"+mounth+"-"+today);
	
	return gap2;
	}

	@Override
	public GdInfo_nu getInfo_week2(String point,String start_time,String end_time) {
		GdInfo_nu gap2=GdInDao.getInfo_week2(point,start_time,end_time);
		float i;
		
		i=gap2.getcK()-gap2.getScK();
		if(-1<i&&i<1){
			gap2.setcK_stu("blue");
			gap2.setSug_cK("保持含量");
		}
		else if(i>=1&&i<2){
			gap2.setcK_stu("orange");
			gap2.setSug_cK("减少钾含量");
		}
		else if(i>=2){
			gap2.setcK_stu("red");
			gap2.setSug_cK("减少钾含量");
		}
		else if(i<=-1&&i>-2){
			gap2.setcK_stu("gray");
			gap2.setSug_cK("追加钾肥");
		}
		else{
			gap2.setcK_stu("black");
			gap2.setSug_cK("追加钾肥");
		}
		
		i=gap2.getcN()-gap2.getScN();
		if(-1<i&&i<1){
			gap2.setcN_stu("blue");
			gap2.setSug_cN("保持氮含量");
		}
		else if(i>=1&&i<2){
			gap2.setcN_stu("orange");
			gap2.setSug_cN("减少氮含量");
		}
		else if(i>=2){
			gap2.setcN_stu("red");
			gap2.setSug_cN("减少氮含量");
		}
		else if(i<=-1&&i>-2){
			gap2.setcN_stu("gray");
			gap2.setSug_cN("追加氮肥");
		}
		else{
			gap2.setcN_stu("black");
			gap2.setSug_cN("追加氮肥");
		}
		i=gap2.getcP()-gap2.getScP();
		if(-1<i&&i<1){
			gap2.setcP_stu("blue");
			gap2.setSug_cP("保持磷含量");
		}
		else if(i>=1&&i<2){
			gap2.setcP_stu("orange");
			gap2.setSug_cP("减少磷含量");
		}
		else if(i>=2){
			gap2.setcP_stu("red");
			gap2.setSug_cP("减少磷含量");
		}
		else if(i<=-1&&i>-2){
			gap2.setcP_stu("gray");
			gap2.setSug_cP("追加磷肥");
		}
		else{
			gap2.setcP_stu("black");
			gap2.setSug_cP("追加磷肥");
		}
		Calendar now=Calendar.getInstance();
		int year=now.get(Calendar.YEAR);
		int mounth=now.get(Calendar.MONTH)+1;
		int today=now.get(Calendar.DATE);
		gap2.setNu_time(year+"-"+mounth+"-"+today);
		
	return gap2;
	}

}	


