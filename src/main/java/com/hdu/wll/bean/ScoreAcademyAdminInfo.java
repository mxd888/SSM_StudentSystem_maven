package com.hdu.wll.bean;

public class ScoreAcademyAdminInfo {
	
	private int id;
	private String user_pass;
	private String user_truename;
	public int getUser_name() {
		return id;
	}
	public void setUser_name(int user_name) {
		this.id = user_name;
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
		return "ScoreAcademyAdminInfo [id=" + id + ", user_pass=" + user_pass + ", user_truename="
				+ user_truename + "]";
	}
	public ScoreAcademyAdminInfo(int user_name, String user_pass, String user_truename) {
		super();
		this.id = user_name;
		this.user_pass = user_pass;
		this.user_truename = user_truename;
	}
	public ScoreAcademyAdminInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
