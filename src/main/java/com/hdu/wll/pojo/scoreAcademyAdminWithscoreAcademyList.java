package com.hdu.wll.pojo;

public class scoreAcademyAdminWithscoreAcademyList {

	private int id;
	private String academyAdminUsername;
	private String academyAdminPassword;
	private String academyAdminName;
	private int academyId;
	private int academyAdminRole;
	private String academyName;
	
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

	public int getAcademyId() {
		return academyId;
	}

	public void setAcademyId(int academyId) {
		this.academyId = academyId;
	}

	public int getAcademyAdminRole() {
		return academyAdminRole;
	}

	public void setAcademyAdminRole(int academyAdminRole) {
		this.academyAdminRole = academyAdminRole;
	}

	public String getAcademyName() {
		return academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	@Override
	public String toString() {
		return "scoreAcademyAdminWithscoreAcademyList [id=" + id + ", academyAdminUsername=" + academyAdminUsername
				+ ", academyAdminPassword=" + academyAdminPassword + ", academyAdminName=" + academyAdminName
				+ ", academyId=" + academyId + ", academyAdminRole=" + academyAdminRole + ", academyName=" + academyName
				+ "]";
	}

	public scoreAcademyAdminWithscoreAcademyList(int id, String academyAdminUsername, String academyAdminPassword,
			String academyAdminName, int academyId, int academyAdminRole, String academyName) {
		super();
		this.id = id;
		this.academyAdminUsername = academyAdminUsername;
		this.academyAdminPassword = academyAdminPassword;
		this.academyAdminName = academyAdminName;
		this.academyId = academyId;
		this.academyAdminRole = academyAdminRole;
		this.academyName = academyName;
	}

	public scoreAcademyAdminWithscoreAcademyList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
