package com.hdu.wll.bean;

public class StudentBean {
	
	
	private String user_name;
	private String user_pass;
	private String user_truename;
	private Integer class_id;
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_truename() {
		return user_truename;
	}
	public void setUser_truename(String user_truename) {
		this.user_truename = user_truename;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "StudentBean [user_name=" + user_name + ", user_pass=" + user_pass + ", user_truename=" + user_truename
				+ ", class_id=" + class_id + "]";
	}
	public StudentBean(String user_name, String user_pass, String user_truename, Integer class_id) {
		super();
		this.user_name = user_name;
		this.user_pass = user_pass;
		this.user_truename = user_truename;
		this.class_id = class_id;
	}
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
