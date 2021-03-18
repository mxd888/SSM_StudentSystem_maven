package com.hdu.wll.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "score_students_list")
public class Student {
	private int id;
	private String studentUsername;
	private String studentPassword;
	private String studentName;
	private Integer studentRole = 4;
	private Integer classId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentUsername() {
		return studentUsername;
	}
	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentRole() {
		return studentRole;
	}
	public void setStudentRole(Integer studentRole) {
		this.studentRole = studentRole;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentUsername=" + studentUsername + ", studentPassword=" + studentPassword
				+ ", studentName=" + studentName + ", studentRole=" + studentRole + ", classId=" + classId + "]";
	}
	public Student(int id, String studentUsername, String studentPassword, String studentName, Integer studentRole,
			Integer classId) {
		super();
		this.id = id;
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
		this.studentName = studentName;
		this.studentRole = studentRole;
		this.classId = classId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
