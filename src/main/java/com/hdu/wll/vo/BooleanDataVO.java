package com.hdu.wll.vo;

public class BooleanDataVO extends DataVO{
	
	private boolean data;

	public boolean isData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}

	public BooleanDataVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BooleanDataVO(int code, String msg, int count) {
		super(code, msg, count);
		// TODO Auto-generated constructor stub
	}

	public BooleanDataVO(int code, String msg, int count, boolean data) {
		super(code, msg, count);
		this.data = data;
	}

	@Override
	public String toString() {
		return "ListDataVO [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}

	
	
	
	

}
