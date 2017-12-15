package com.zhang.dao;

import java.util.List;
import java.util.Map;

import com.zhang.pojo.know_pest;

public interface know_pestMapper {

	int getkp_count();

	List<know_pest> getkp_info(Map map);

	void getkp_delete(int id);

	void getkp_insert(String a, String b, String c, String d, String e);

	know_pest getkp_this(int id);

	int getkp_update(int id,String crop, String disease_name, String disease_chara,
			String growth, String cure_treat);

	int set_gi(String point, float swater, float scN, float scP, float scK,
			float spH);

}
