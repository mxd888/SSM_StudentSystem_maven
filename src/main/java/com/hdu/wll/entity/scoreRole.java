package com.hdu.wll.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "score_role")
public class scoreRole {
	
	private Integer roleId;
	private String roleName;
	
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public scoreRole(Integer roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "scoreRole [roleId=" + roleId + ", roleName=" + roleName + "]";
	}

	public scoreRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
