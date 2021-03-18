package com.hdu.wll.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "score_class_list")
public class scoreClassList {

	private Integer classId;
	private String classListName;
	private Integer classStudentsCount;
	private Integer academyId;
	
	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassListName() {
		return classListName;
	}

	public void setClassListName(String classListName) {
		this.classListName = classListName;
	}

	public Integer getClassStudentsCount() {
		return classStudentsCount;
	}

	public void setClassStudentsCount(Integer classStudentsCount) {
		this.classStudentsCount = classStudentsCount;
	}

	public Integer getAcademyId() {
		return academyId;
	}

	public void setAcademyId(Integer academyId) {
		this.academyId = academyId;
	}

	public scoreClassList(Integer classId, String classListName, Integer classStudentsCount, Integer academyId) {
		super();
		this.classId = classId;
		this.classListName = classListName;
		this.classStudentsCount = classStudentsCount;
		this.academyId = academyId;
	}

	@Override
	public String toString() {
		return "scoreClassList [classId=" + classId + ", classListName=" + classListName + ", classStudentsCount="
				+ classStudentsCount + ", academyId=" + academyId + "]";
	}

	public scoreClassList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
