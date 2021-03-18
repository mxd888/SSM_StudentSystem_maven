package com.hdu.wll.vo;

import java.util.List;

public class ListDataVO<T> extends DataVO{

	private List<T> data;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public ListDataVO(int code, String msg, int count, List<T> data) {
		super(code, msg, count);
		this.data = data;
	}

	public ListDataVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListDataVO(int code, String msg, int count) {
		super(code, msg, count);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ListDataVO [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}

	
	
	
	
}
