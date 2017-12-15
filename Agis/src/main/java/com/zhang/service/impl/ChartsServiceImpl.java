package com.zhang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.dao.ChartsMapper;
import com.zhang.pojo.pHChart;
import com.zhang.pojo.tempChart;
import com.zhang.pojo.waterChart;
import com.zhang.pojo.cNChart;
import com.zhang.service.ChartsService;
@Service
public class ChartsServiceImpl implements ChartsService{
	@Autowired(required = false)
    private ChartsMapper chartsDao;
	/* (non-Javadoc)
	 * @see com.zhang.service.UserService#insert(com.zhang.pojo.User)
	 */
	
	@Override
	public List<pHChart> getpHchart(String point,String start_time,String end_time){
		return chartsDao.getpHchart(point,start_time,end_time);
	}
	@Override
	public List<cNChart> getcNchart(String point,String start_time,String end_time){
		return chartsDao.getcNchart(point,start_time,end_time);
	}
	@Override
	public List<waterChart> getwaterchart(String point,String start_time,String end_time){
		return chartsDao.getwaterchart(point,start_time,end_time);
	}
	@Override
	public List<tempChart> gettempchart(String point,String start_time,String end_time){
		return chartsDao.gettempchart(point,start_time,end_time);
	}

}
