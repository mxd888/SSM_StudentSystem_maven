package com.hdu.wll.pojo;


public class SystemAdminInfo {

	
	private int sysAdminId;
	private String sysAdminUsername;
	private String sysAdminPassword;
	private String sysAdminName;
	private int sysAdminRole;
	private String roleName;
	
	public int getSysAdminId() {
		return sysAdminId;
	}

	public void setSysAdminId(int sysAdminId) {
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

	public int getSysAdminRole() {
		return sysAdminRole;
	}

	public void setSysAdminRole(int sysAdminRole) {
		this.sysAdminRole = sysAdminRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public SystemAdminInfo(int sysAdminId, String sysAdminUsername, String sysAdminPassword, String sysAdminName,
			int sysAdminRole, String roleName) {
		super();
		this.sysAdminId = sysAdminId;
		this.sysAdminUsername = sysAdminUsername;
		this.sysAdminPassword = sysAdminPassword;
		this.sysAdminName = sysAdminName;
		this.sysAdminRole = sysAdminRole;
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "SystemAdminInfo [sysAdminId=" + sysAdminId + ", sysAdminUsername=" + sysAdminUsername
				+ ", sysAdminPassword=" + sysAdminPassword + ", sysAdminName=" + sysAdminName + ", sysAdminRole="
				+ sysAdminRole + ", roleName=" + roleName + "]";
	}

	public SystemAdminInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
