package com.wtb.entity;

public class Test {
	private String username;
	private String pwd;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Test [username=" + username + ", pwd=" + pwd + "]";
	}
	public Test(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
}
