package com.zhang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.zhang.dao.plant_situationMapper;
import com.zhang.pojo.kp_cure;
import com.zhang.pojo.plant_situation;
import com.zhang.service.plant_situationService;

@Service
public class plant_situationImpl implements plant_situationService{
	@Autowired(required = false)
    private plant_situationMapper plant_situationDao;
	/* (non-Javadoc)
	 * @see com.zhang.service.UserService#insert(com.zhang.pojo.User)
	 */
	
	@Override
	public plant_situation getmessages(String point){
		List<String> list=plant_situationDao.getimage(point);
		plant_situation pro=plant_situationDao.getmessages(point);
		System.out.println(list);
		pro.setImg1(list.get(0));
		pro.setImg2(list.get(1));
		pro.setImg3(list.get(2));
		return pro;
	}
	@Override
	public kp_cure getcure(int id){
		
		return plant_situationDao.getcure(id);
	}

}
