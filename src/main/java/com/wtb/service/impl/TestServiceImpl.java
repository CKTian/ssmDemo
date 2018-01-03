package com.wtb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wtb.dao.TestDao;
import com.wtb.entity.Test;
import com.wtb.service.TestService;

@Service
@Transactional
public class TestServiceImpl implements TestService {
	// 注入Service依赖
	@Autowired
	private TestDao testDao;
	public Test selectOne(String username){
		return testDao.selectOne(username);
	}

}
