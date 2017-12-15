package com.zhang.dao;

import java.util.List;

import com.zhang.pojo.pHChart;
import com.zhang.pojo.tempChart;
import com.zhang.pojo.waterChart;
import com.zhang.pojo.cNChart;


public interface ChartsMapper {
	List<pHChart> getpHchart(String point, String start_time, String end_time);
	List<cNChart> getcNchart(String point,String start_time,String end_time);
	List<waterChart> getwaterchart(String point, String start_time, String end_time);
	List<tempChart> gettempchart(String point, String start_time,
			String end_time);
	
}
