package com.hdu.wll.vo;

public class ObjectData<T> extends DataVO{

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ObjectData(int code, String msg, int count, T data) {
		super(code, msg, count);
		this.data = data;
	}

	public ObjectData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ObjectData(int code, String msg, int count) {
		super(code, msg, count);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ObjectData [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}

	
	
	
}
