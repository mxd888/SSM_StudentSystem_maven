package com.hdu.wll.bean;

public class timeInfo {
	
	private Integer term_id;
	private String term_name;
	private String start_time;
	private String end_time;
	public String getTerm_name() {
		return term_name;
	}
	public void setTerm_name(String term_name) {
		this.term_name = term_name;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	
	public Integer getTerm_id() {
		return term_id;
	}
	public void setTerm_id(Integer term_id) {
		this.term_id = term_id;
	}
	
	public timeInfo(Integer term_id, String term_name, String start_time, String end_time) {
		super();
		this.term_id = term_id;
		this.term_name = term_name;
		this.start_time = start_time;
		this.end_time = end_time;
	}
	@Override
	public String toString() {
		return "timeInfo [term_id=" + term_id + ", term_name=" + term_name + ", start_time=" + start_time
				+ ", end_time=" + end_time + "]";
	}
	public timeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
