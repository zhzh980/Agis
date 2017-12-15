package com.zhang.dao;

import java.util.List;

import com.zhang.pojo.kp_cure;
import com.zhang.pojo.plant_situation;

public interface plant_situationMapper {
	List<String> getimage(String point);

	plant_situation getmessages(String point);

	kp_cure getcure(int id);

	
}
