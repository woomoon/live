package com.woomoon.entitys;

public class UserEntity {

	private Integer user_id;
	private String user_name;
	private String user_pwd;
	private String user_time;
	private Integer dept_id;

	public Integer getUser_id() {
		return user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public String getUser_time() {
		return user_time;
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public void setUser_time(String user_time) {
		this.user_time = user_time;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}


}