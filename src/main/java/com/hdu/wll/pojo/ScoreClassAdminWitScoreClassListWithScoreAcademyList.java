package com.hdu.wll.pojo;

public class ScoreClassAdminWitScoreClassListWithScoreAcademyList {

	private int id;
	private String classAdminUsername;
	private String classAdminPassword;
	private String classAdminName;
	private String classId;
	private String classAminRole;
	private String classListName;
	private String classStudentsCount;
	private String academyId;
	private String academyName;
	
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

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassAminRole() {
		return classAminRole;
	}

	public void setClassAminRole(String classAminRole) {
		this.classAminRole = classAminRole;
	}

	public String getClassListName() {
		return classListName;
	}

	public void setClassListName(String classListName) {
		this.classListName = classListName;
	}

	public String getClassStudentsCount() {
		return classStudentsCount;
	}

	public void setClassStudentsCount(String classStudentsCount) {
		this.classStudentsCount = classStudentsCount;
	}

	public String getAcademyId() {
		return academyId;
	}

	public void setAcademyId(String academyId) {
		this.academyId = academyId;
	}

	public String getAcademyName() {
		return academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	public ScoreClassAdminWitScoreClassListWithScoreAcademyList(int id, String classAdminUsername,
			String classAdminPassword, String classAdminName, String classId, String classAminRole,
			String classListName, String classStudentsCount, String academyId, String academyName) {
		super();
		this.id = id;
		this.classAdminUsername = classAdminUsername;
		this.classAdminPassword = classAdminPassword;
		this.classAdminName = classAdminName;
		this.classId = classId;
		this.classAminRole = classAminRole;
		this.classListName = classListName;
		this.classStudentsCount = classStudentsCount;
		this.academyId = academyId;
		this.academyName = academyName;
	}

	@Override
	public String toString() {
		return "ScoreClassAdminWitScoreClassListWithScoreAcademyList [id=" + id + ", classAdminUsername="
				+ classAdminUsername + ", classAdminPassword=" + classAdminPassword + ", classAdminName="
				+ classAdminName + ", classId=" + classId + ", classAminRole=" + classAminRole + ", classListName="
				+ classListName + ", classStudentsCount=" + classStudentsCount + ", academyId=" + academyId
				+ ", academyName=" + academyName + "]";
	}

	public ScoreClassAdminWitScoreClassListWithScoreAcademyList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
