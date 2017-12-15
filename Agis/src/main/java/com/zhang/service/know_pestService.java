package com.zhang.service;

import java.util.List;

import com.zhang.pojo.know_pest;

public interface know_pestService {
	public int getkp_count();
	public List<know_pest> getkp_info(int a,int b);
	public void getkp_delete(int id);

	public void getkp_insert(String crop, String disease_name,String disease_chara, String growth, String cure_treat);
	public know_pest getkp_this(int a);
	public void getkp_update(int id,String crop, String disease_name,
			String disease_chara, String growth, String cure_treat);
	
	public int set_gi(String point,float swater,float scN,float scP,float scK,float spH);
	
}
