package com.wtb.dao;

import com.wtb.entity.Test;

public interface TestDao {
	/**
	 * 查询用户名
	 * 
	 * @param id
	 * @return
	 */
	Test selectOne(String username);
}
