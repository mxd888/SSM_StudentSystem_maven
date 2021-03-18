package com.hdu.wll.Enum;

public enum PageEnum {
	
		CURRENTLIMIT("页默认值",20);
	
	
	private PageEnum(String info, int defualtlimit) {
			this.info = info;
			this.defualtlimit = defualtlimit;
		}
	private String info;
	private int defualtlimit;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getDefualtlimit() {
		return defualtlimit;
	}
	public void setDefualtlimit(int defualtlimit) {
		this.defualtlimit = defualtlimit;
	}

	
}
