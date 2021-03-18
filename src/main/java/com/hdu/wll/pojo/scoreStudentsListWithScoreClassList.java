package com.hdu.wll.pojo;

public class scoreStudentsListWithScoreClassList {

	private int id;
	private String studentUsername;
	private String studentPassword;
	private String studentName;
	private int studentRole;
	private int classId;
	private String classListName;
	private int classStudentsCount;
	private int academyId;
	
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

	public int getStudentRole() {
		return studentRole;
	}

	public void setStudentRole(int studentRole) {
		this.studentRole = studentRole;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassListName() {
		return classListName;
	}

	public void setClassListName(String classListName) {
		this.classListName = classListName;
	}

	public int getClassStudentsCount() {
		return classStudentsCount;
	}

	public void setClassStudentsCount(int classStudentsCount) {
		this.classStudentsCount = classStudentsCount;
	}

	public int getAcademyId() {
		return academyId;
	}

	public void setAcademyId(int academyId) {
		this.academyId = academyId;
	}

	public scoreStudentsListWithScoreClassList(int id, String studentUsername, String studentPassword,
			String studentName, int studentRole, int classId, String classListName, int classStudentsCount,
			int academyId) {
		super();
		this.id = id;
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
		this.studentName = studentName;
		this.studentRole = studentRole;
		this.classId = classId;
		this.classListName = classListName;
		this.classStudentsCount = classStudentsCount;
		this.academyId = academyId;
	}

	@Override
	public String toString() {
		return "scoreStudentsListWithScoreClassList [id=" + id + ", studentUsername=" + studentUsername
				+ ", studentPassword=" + studentPassword + ", studentName=" + studentName + ", studentRole="
				+ studentRole + ", classId=" + classId + ", classListName=" + classListName + ", classStudentsCount="
				+ classStudentsCount + ", academyId=" + academyId + "]";
	}

	public scoreStudentsListWithScoreClassList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
