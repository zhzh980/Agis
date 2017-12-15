package com.zhang.service;

import com.zhang.pojo.kp_cure;
import com.zhang.pojo.plant_situation;

public interface plant_situationService {
	public plant_situation getmessages(String point);

	public kp_cure getcure(int id);
}
