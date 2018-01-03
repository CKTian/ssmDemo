package com.wtb.service;

import com.wtb.entity.Test;

public interface TestService { 
	/**
	 * 
	 * TODO 根据 用户输入的用户名 查询信息
	 * @author 王天博
	 * 2018年1月2日
	 * @param username
	 * @return
	 */
	public Test selectOne(String username);
}
