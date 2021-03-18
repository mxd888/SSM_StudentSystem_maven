package com.hdu.wll.vo;


public class DataVO {
	public int code;
	public String msg;
	public int count;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public DataVO(int code, String msg, int count) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
	}
	public DataVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DataVO [code=" + code + ", msg=" + msg + ", count=" + count + "]";
	}

	

}
