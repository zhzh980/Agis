package com.zhang.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.dao.know_pestMapper;
import com.zhang.pojo.know_pest;
import com.zhang.service.know_pestService;
@Service
public class know_pestServiceImpl implements know_pestService{
	@Autowired(required = false)
    private know_pestMapper kpDao;
	
	@Override
	public int getkp_count() {
		// TODO Auto-generated method stub
		return kpDao.getkp_count();
	}
	
	@Override
	public List<know_pest> getkp_info(int a, int b) {
		Map map = new HashMap<>();
		map.put("a", (a-1)*10);
		map.put("b",b);
		return kpDao.getkp_info(map);
	}
	

	@Override
	public void getkp_delete(int id) {
		
		 kpDao.getkp_delete(id);
	}
	
	@Override
	public void getkp_insert(String crop, String disease_name,String disease_chara, String growth, String cure_treat) {
		
		 kpDao.getkp_insert(crop,disease_name,disease_chara,growth,cure_treat);
	}
	
	@Override
	public know_pest getkp_this(int a){

		 return kpDao.getkp_this(a);
		
	}
	
	@Override
	public void getkp_update(int id,String crop, String disease_name,String disease_chara, String growth, String cure_treat) {
		
		 kpDao.getkp_update(id,crop,disease_name,disease_chara,growth,cure_treat);
	}
	
	
	@Override
	public int set_gi(String point,float swater,float scN,float scP,float scK,float spH){
		return kpDao.set_gi(point, swater, scN, scP, scK, spH);
	}
	
}
