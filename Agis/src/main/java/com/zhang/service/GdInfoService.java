package com.zhang.service;

import com.zhang.pojo.GdInfo;
import com.zhang.pojo.GdInfo_nu;

public interface GdInfoService {
	public GdInfo getInfo(String point);
	public GdInfo_nu getInfo2(String point);
	public GdInfo getInfo_month(String point,String start_time,String end_time);
	public GdInfo_nu getInfo_month2(String point,String start_time,String end_time);
	public GdInfo getInfo_week(String point,String start_time,String end_time);
	public GdInfo_nu getInfo_week2(String point,String start_time,String end_time);
}
