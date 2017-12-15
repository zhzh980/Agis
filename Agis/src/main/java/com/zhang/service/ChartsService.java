package com.zhang.service;

import java.util.List;

import com.zhang.pojo.pHChart;
import com.zhang.pojo.tempChart;
import com.zhang.pojo.waterChart;
import com.zhang.pojo.cNChart;

public interface ChartsService {
	public List<pHChart> getpHchart(String point, String start_time, String end_time);
	public List<cNChart> getcNchart(String point,String start_time,String end_time);
	public List<tempChart> gettempchart(String point,String start_time,String end_time);
	public List<waterChart> getwaterchart(String point,String start_time,String end_time);
}
