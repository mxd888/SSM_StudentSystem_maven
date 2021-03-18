package com.hdu.wll.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "score_academy_admin")
public class scoreAcademyAdmin {
	private int id;
	private String academyAdminUsername;
	private String academyAdminPassword;
	private String academyAdminName;
	private Integer academyId;
	private int academyAdminRole = 2;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcademyAdminUsername() {
		return academyAdminUsername;
	}

	public void setAcademyAdminUsername(String academyAdminUsername) {
		this.academyAdminUsername = academyAdminUsername;
	}

	public String getAcademyAdminPassword() {
		return academyAdminPassword;
	}

	public void setAcademyAdminPassword(String academyAdminPassword) {
		this.academyAdminPassword = academyAdminPassword;
	}

	public String getAcademyAdminName() {
		return academyAdminName;
	}

	public void setAcademyAdminName(String academyAdminName) {
		this.academyAdminName = academyAdminName;
	}

	public Integer getAcademyId() {
		return academyId;
	}

	public void setAcademyId(Integer academyId) {
		this.academyId = academyId;
	}

	public int getAcademyAdminRole() {
		return academyAdminRole;
	}

	public void setAcademyAdminRole(int academyAdminRole) {
		this.academyAdminRole = academyAdminRole;
	}

	public scoreAcademyAdmin(int id, String academyAdminUsername, String academyAdminPassword, String academyAdminName,
			Integer academyId, int academyAdminRole) {
		super();
		this.id = id;
		this.academyAdminUsername = academyAdminUsername;
		this.academyAdminPassword = academyAdminPassword;
		this.academyAdminName = academyAdminName;
		this.academyId = academyId;
		this.academyAdminRole = academyAdminRole;
	}

	@Override
	public String toString() {
		return "scoreAcademyAdmin [id=" + id + ", academyAdminUsername=" + academyAdminUsername
				+ ", academyAdminPassword=" + academyAdminPassword + ", academyAdminName=" + academyAdminName
				+ ", academyId=" + academyId + ", academyAdminRole=" + academyAdminRole + "]";
	}

	public scoreAcademyAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
