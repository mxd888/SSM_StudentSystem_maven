package com.hdu.wll.entity;

import java.sql.Date;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "score_input_time")
public class scoreInputTime {
	
	private int termId;
	private String termName;
	private Date termStartTime;
	private Date termEndTime;
	
	public int getTermId() {
		return termId;
	}

	public void setTermId(int termId) {
		this.termId = termId;
	}

	public String getTermName() {
		return termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

	public Date getTermStartTime() {
		return termStartTime;
	}

	public void setTermStartTime(Date termStartTime) {
		this.termStartTime = termStartTime;
	}

	public Date getTermEndTime() {
		return termEndTime;
	}

	public void setTermEndTime(Date termEndTime) {
		this.termEndTime = termEndTime;
	}

	public scoreInputTime(int termId, String termName, Date termStartTime, Date termEndTime) {
		super();
		this.termId = termId;
		this.termName = termName;
		this.termStartTime = termStartTime;
		this.termEndTime = termEndTime;
	}

	@Override
	public String toString() {
		return "scoreInputTime [termId=" + termId + ", termName=" + termName + ", termStartTime=" + termStartTime
				+ ", termEndTime=" + termEndTime + "]";
	}

	public scoreInputTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
