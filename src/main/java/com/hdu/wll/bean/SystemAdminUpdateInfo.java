package com.hdu.wll.bean;

public class SystemAdminUpdateInfo {
	
	
	private int user_id;
	private String user_pass;
	private String user_truename;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	@Override
	public String toString() {
		return "SystemAdminUpdateInfo [user_id=" + user_id + ", user_pass=" + user_pass + ", user_truename="
				+ user_truename + "]";
	}
	public SystemAdminUpdateInfo(int user_id, String user_pass, String user_truename) {
		super();
		this.user_id = user_id;
		this.user_pass = user_pass;
		this.user_truename = user_truename;
	}
	public SystemAdminUpdateInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
