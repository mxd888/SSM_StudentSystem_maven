package com.hdu.wll.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hdu.wll.dao.StudentMapper;
import com.hdu.wll.entity.Student;
import com.hdu.wll.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public boolean StudentLogin(String username, String pass) {
		// TODO Auto-generated method stub
		QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("student_username", username);
		queryWrapper.eq("student_password", pass);
		return studentMapper.selectCount(queryWrapper)>0;
	}

}
