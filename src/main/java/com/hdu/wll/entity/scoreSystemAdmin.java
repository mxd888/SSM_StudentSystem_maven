package com.hdu.wll.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "score_system_admin")
public class scoreSystemAdmin {
	
	private Integer sysAdminId;
	private String sysAdminUsername;
	private String sysAdminPassword;
	private String sysAdminName;
	private Integer sysAdminRole;
	
	public Integer getSysAdminId() {
		return sysAdminId;
	}

	public void setSysAdminId(Integer sysAdminId) {
		this.sysAdminId = sysAdminId;
	}

	public String getSysAdminUsername() {
		return sysAdminUsername;
	}

	public void setSysAdminUsername(String sysAdminUsername) {
		this.sysAdminUsername = sysAdminUsername;
	}

	public String getSysAdminPassword() {
		return sysAdminPassword;
	}

	public void setSysAdminPassword(String sysAdminPassword) {
		this.sysAdminPassword = sysAdminPassword;
	}

	public String getSysAdminName() {
		return sysAdminName;
	}

	public void setSysAdminName(String sysAdminName) {
		this.sysAdminName = sysAdminName;
	}

	public Integer getSysAdminRole() {
		return sysAdminRole;
	}

	public void setSysAdminRole(Integer sysAdminRole) {
		this.sysAdminRole = sysAdminRole;
	}

	public scoreSystemAdmin(Integer sysAdminId, String sysAdminUsername, String sysAdminPassword, String sysAdminName,
			Integer sysAdminRole) {
		super();
		this.sysAdminId = sysAdminId;
		this.sysAdminUsername = sysAdminUsername;
		this.sysAdminPassword = sysAdminPassword;
		this.sysAdminName = sysAdminName;
		this.sysAdminRole = sysAdminRole;
	}

	@Override
	public String toString() {
		return "scoreSystemAdmin [sysAdminId=" + sysAdminId + ", sysAdminUsername=" + sysAdminUsername
				+ ", sysAdminPassword=" + sysAdminPassword + ", sysAdminName=" + sysAdminName + ", sysAdminRole="
				+ sysAdminRole + "]";
	}

	public scoreSystemAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
