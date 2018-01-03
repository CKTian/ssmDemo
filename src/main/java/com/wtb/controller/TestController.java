package com.wtb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wtb.entity.Test;
import com.wtb.service.TestService;

@Controller
@RequestMapping("/TestController")
public class TestController {
	@Autowired
	private TestService testService;
	@RequestMapping("/test.do")
	public String login(Test data,HttpServletResponse response){
		String usersername=data.getUsername();
		Test test2=testService.selectOne(usersername);
		String result="1";
		if(test2!= null&&data.getPwd().equals(test2.getPwd())){
			//登录成功
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.print(result);
		}
	return null;
	}
	
}
