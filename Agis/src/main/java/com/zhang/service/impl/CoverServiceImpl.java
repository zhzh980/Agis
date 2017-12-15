package com.zhang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.dao.CoverMapper;

import com.zhang.pojo.Cover;

import com.zhang.service.CoverService;
@Service
public class CoverServiceImpl implements CoverService{
	@Autowired(required = false)
	private CoverMapper CoverDao;

	@Override
	public List<Cover> getCover() {
		// TODO Auto-generated method stub
		return CoverDao.getCover();
	}
}
