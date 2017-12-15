package com.zhang.dao;

import com.zhang.pojo.GdInfo;
import com.zhang.pojo.GdInfo_nu;

public interface GdInfoMapper {
	 GdInfo getInfo(String point);

	GdInfo getInfo_month(String point, String start_time, String end_time);

	GdInfo getInfo_week(String point, String start_time, String end_time);

	GdInfo_nu getInfo2(String point);

	GdInfo_nu getInfo_month2(String point, String start_time, String end_time);

	GdInfo_nu getInfo_week2(String point, String start_time, String end_time);
	
}
