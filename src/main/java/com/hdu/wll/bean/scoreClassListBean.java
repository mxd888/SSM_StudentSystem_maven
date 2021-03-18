package com.hdu.wll.bean;

public class scoreClassListBean {
	
	
	private int class_id;
	private String class_name;
	private int students_count;
	private int  academy_id;
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public int getStudents_count() {
		return students_count;
	}
	public void setStudents_count(int students_count) {
		this.students_count = students_count;
	}
	public int getAcademy_id() {
		return academy_id;
	}
	public void setAcademy_id(int academy_id) {
		this.academy_id = academy_id;
	}
	@Override
	public String toString() {
		return "scoreClassListBean [class_id=" + class_id + ", class_name=" + class_name + ", students_count="
				+ students_count + ", academy_id=" + academy_id + "]";
	}
	public scoreClassListBean(int class_id, String class_name, int students_count, int academy_id) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.students_count = students_count;
		this.academy_id = academy_id;
	}
	public scoreClassListBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
