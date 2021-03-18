package com.hdu.wll.bean;

public class scoreClassAdminBean {
	
	private int id;
	private String user_name;
	private String user_pass;
	private String user_truname;
	private Integer  class_id;
	private Integer academy_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getUser_truname() {
		return user_truname;
	}
	public void setUser_truname(String user_truname) {
		this.user_truname = user_truname;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public Integer getAcademy_id() {
		return academy_id;
	}
	public void setAcademy_id(Integer academy_id) {
		this.academy_id = academy_id;
	}
	@Override
	public String toString() {
		return "scoreClassAdminBean [id=" + id + ", user_name=" + user_name + ", user_pass=" + user_pass
				+ ", user_truname=" + user_truname + ", class_id=" + class_id + ", academy_id=" + academy_id + "]";
	}
	public scoreClassAdminBean(int id, String user_name, String user_pass, String user_truname, Integer class_id,
			Integer academy_id) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_pass = user_pass;
		this.user_truname = user_truname;
		this.class_id = class_id;
		this.academy_id = academy_id;
	}
	public scoreClassAdminBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
