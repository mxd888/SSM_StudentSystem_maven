package com.hdu.wll.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "score_academy_list")
public class scoreAcademyList {

	private Integer academyId;
	private String academyName;
	
	public Integer getAcademyId() {
		return academyId;
	}

	public void setAcademyId(Integer academyId) {
		this.academyId = academyId;
	}

	public String getAcademyName() {
		return academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	public scoreAcademyList(Integer academyId, String academyName) {
		super();
		this.academyId = academyId;
		this.academyName = academyName;
	}

	@Override
	public String toString() {
		return "scoreAcademyList [academyId=" + academyId + ", academyName=" + academyName + "]";
	}

	public scoreAcademyList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
