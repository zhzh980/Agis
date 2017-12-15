package com.zhang.service;

import java.util.List;

import com.zhang.pojo.Gap;
import com.zhang.pojo.marker;

public interface markerService {
	public List<marker> getmarker();
	public List<Gap> getGap();
	public List<Gap> getGap_month(String start_time,String end_time);
	public List<Gap> getGap_week(String start_time,String end_time);
	
}
