package com.hdu.wll.pojo;

public class scoreClassListWithScoreAcademyList {

	private int classId;
	private String classListName;
	private int classStudentsCount;
	private int academyId;
	private String academyName;
	
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

	public String getAcademyName() {
		return academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	public scoreClassListWithScoreAcademyList(int classId, String classListName, int classStudentsCount, int academyId,
			String academyName) {
		super();
		this.classId = classId;
		this.classListName = classListName;
		this.classStudentsCount = classStudentsCount;
		this.academyId = academyId;
		this.academyName = academyName;
	}

	@Override
	public String toString() {
		return "scoreClassListWithScoreAcademyList [classId=" + classId + ", classListName=" + classListName
				+ ", classStudentsCount=" + classStudentsCount + ", academyId=" + academyId + ", academyName="
				+ academyName + "]";
	}

	public scoreClassListWithScoreAcademyList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
