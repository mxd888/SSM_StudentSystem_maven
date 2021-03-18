package com.hdu.wll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hdu.wll.bean.SystemAdminUpdateInfo;
import com.hdu.wll.dao.scoreSystemAdminMapper;
import com.hdu.wll.entity.scoreSystemAdmin;
import com.hdu.wll.pojo.SystemAdminInfo;
import com.hdu.wll.service.SystemAdminService;


@Service
@Transactional
public class SystemAdminServiceImpl implements SystemAdminService {

	
	@Autowired
	private scoreSystemAdminMapper scoreSystemAdmindao;
	
	
	@Override
	public boolean update(SystemAdminUpdateInfo system) {
		// TODO Auto-generated method stub
		UpdateWrapper<scoreSystemAdmin> updateWrapper = new UpdateWrapper<>();
		updateWrapper.eq("sys_admin_id", system.getUser_id());
		scoreSystemAdmin scoreSystemAdmin = new scoreSystemAdmin();
		scoreSystemAdmin.setSysAdminPassword(system.getUser_pass());
		scoreSystemAdmin.setSysAdminUsername(system.getUser_truename());
		int i = scoreSystemAdmindao.update(scoreSystemAdmin, updateWrapper);
		return i > 0;
	}

	
	@Override
	public boolean Login(String username, String pass) {
		// TODO Auto-generated method stub
		QueryWrapper<scoreSystemAdmin> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("sys_admin_username", username);
		queryWrapper.eq("sys_admin_password", pass);
		int i = scoreSystemAdmindao.selectCount(queryWrapper);
		return i > 0;
	}

	
	@Override
	public SystemAdminInfo getInfo(String username, String pass) {
		// TODO Auto-generated method stub
		SystemAdminInfo systemAdminInfo = scoreSystemAdmindao.getInfoWithOther(username, pass);
		return systemAdminInfo;
	}

}
