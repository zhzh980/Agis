package com.zhang.dao;
import java.util.List;

import com.zhang.pojo.Gap;
import com.zhang.pojo.marker;
public interface markerMapper {
	List<marker> getmarker();
	List<Gap> getGap();
//	Gap getInfo(String point);
	List<Gap> getGap_month(String start_time, String end_time);
	List<Gap> getGap_week(String start_time, String end_time);
	
}
