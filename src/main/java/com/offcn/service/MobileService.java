package com.offcn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.offcn.bean.Mobile;
import com.offcn.dao.MobileNumberMapper;

@Service
public class MobileService {

	@Autowired
	private MobileNumberMapper mapper;
	@Transactional
	public Mobile getMobile(int number){
		return mapper.getMobile(number);
	}
}
