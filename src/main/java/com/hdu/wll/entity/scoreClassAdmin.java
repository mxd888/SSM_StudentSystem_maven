package com.hdu.wll.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "score_class_admin")
public class scoreClassAdmin {

	private int id;
	private String classAdminUsername;
	private String classAdminPassword;
	private String classAdminName;
	private Integer classId;
	private int classAminRole = 3;
	private Integer academyId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassAdminUsername() {
		return classAdminUsername;
	}

	public void setClassAdminUsername(String classAdminUsername) {
		this.classAdminUsername = classAdminUsername;
	}

	public String getClassAdminPassword() {
		return classAdminPassword;
	}

	public void setClassAdminPassword(String classAdminPassword) {
		this.classAdminPassword = classAdminPassword;
	}

	public String getClassAdminName() {
		return classAdminName;
	}

	public void setClassAdminName(String classAdminName) {
		this.classAdminName = classAdminName;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public int getClassAminRole() {
		return classAminRole;
	}

	public void setClassAminRole(int classAminRole) {
		this.classAminRole = classAminRole;
	}

	public Integer getAcademyId() {
		return academyId;
	}

	public void setAcademyId(Integer academyId) {
		this.academyId = academyId;
	}

	public scoreClassAdmin(int id, String classAdminUsername, String classAdminPassword, String classAdminName,
			Integer classId, int classAminRole, Integer academyId) {
		super();
		this.id = id;
		this.classAdminUsername = classAdminUsername;
		this.classAdminPassword = classAdminPassword;
		this.classAdminName = classAdminName;
		this.classId = classId;
		this.classAminRole = classAminRole;
		this.academyId = academyId;
	}

	@Override
	public String toString() {
		return "scoreClassAdmin [id=" + id + ", classAdminUsername=" + classAdminUsername + ", classAdminPassword="
				+ classAdminPassword + ", classAdminName=" + classAdminName + ", classId=" + classId
				+ ", classAminRole=" + classAminRole + ", academyId=" + academyId + "]";
	}

	public scoreClassAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
