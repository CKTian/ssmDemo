package com.wtb.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wtb.BaseTest;

public class TestDaoTest extends BaseTest{
	@Autowired
	private TestDao testDao;

	@Test
	public void testselectOne() throws Exception {
		String username = "123";
		com.wtb.entity.Test test = testDao.selectOne(username);
		System.out.println(test);
	}
}
