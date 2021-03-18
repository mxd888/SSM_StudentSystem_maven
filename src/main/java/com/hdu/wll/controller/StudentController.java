package com.hdu.wll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hdu.wll.Enum.PageEnum;
import com.hdu.wll.bean.StudentBean;
import com.hdu.wll.dao.StudentMapper;
import com.hdu.wll.entity.Student;
import com.hdu.wll.pojo.scoreStudentsListWithScoreClassList;
import com.hdu.wll.service.StudentService;
import com.hdu.wll.vo.BooleanDataVO;
import com.hdu.wll.vo.ListDataVO;

@CrossOrigin
@RestController("StudentController")
@RequestMapping("Student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentMapper Studentdao;
	
	
	@GetMapping("/test")
	public String test() {
		return "你好 世界";
	};
	
	// http://127.0.0.1:8080/StudentSystem/Student/studentLogin?user_name=20170405102018&user_pass=123456
	@GetMapping("/studentLogin")
	public Object StudentLogin(@RequestParam("user_name") String username,@RequestParam("user_pass") String pass) {
		boolean b = studentService.StudentLogin(username, pass);
		BooleanDataVO dataVO = new BooleanDataVO();
		if (b) {
			dataVO.setCode(1);
			dataVO.setMsg("登录成功");
			dataVO.setData(b);
		}else {
			dataVO.setCode(0);
			dataVO.setMsg("登录失败");
			dataVO.setData(b);
		}
		return dataVO;
		
	};
	
	
	@PostMapping("/insertStudent")
	public Object insert(@RequestBody StudentBean StudentBean) {
		Student student = new Student();
		student.setStudentUsername(StudentBean.getUser_name());
		student.setStudentPassword(StudentBean.getUser_pass());
		student.setStudentName(StudentBean.getUser_truename());
		student.setClassId(StudentBean.getClass_id());
		int i = Studentdao.insert(student);
		BooleanDataVO dataVO = new BooleanDataVO();
		if (i>0) {
			dataVO.setCode(1);
			dataVO.setMsg("操作成功");
			dataVO.setData(true);
		} else {
			dataVO.setCode(0);
			dataVO.setMsg("操作失败");
			dataVO.setData(false);
			
		}
		return dataVO;
	};
	
	
	@GetMapping("/deleteStudent")
	public Object delete(@RequestParam("id") int id) {
		int i = Studentdao.deleteById(id);
		BooleanDataVO dataVO = new BooleanDataVO();
		if (i>0) {
			dataVO.setCode(1);
			dataVO.setMsg("操作成功");
			dataVO.setData(true);
		} else {
			dataVO.setCode(0);
			dataVO.setMsg("操作失败");
			dataVO.setData(false);
			
		}
		return dataVO;
	};
	
	
	@PostMapping("/updateStudent")
	public Object update(@RequestBody StudentBean studentBean) {
		Student student = new Student();
		student.setStudentUsername(studentBean.getUser_name());
		student.setStudentPassword(studentBean.getUser_pass());
		student.setStudentName(studentBean.getUser_truename());
		UpdateWrapper<Student> updateWrapper = new UpdateWrapper<>();
		updateWrapper.eq("student_username", studentBean.getUser_name());
		int i = Studentdao.update(student, updateWrapper);
		BooleanDataVO dataVO = new BooleanDataVO();
		if (i>0) {
			dataVO.setCode(1);
			dataVO.setMsg("操作成功");
			dataVO.setData(true);
		} else {
			dataVO.setCode(0);
			dataVO.setMsg("操作失败");
			dataVO.setData(false);
			
		}
		return dataVO;
	};
	
	
	// http://127.0.0.1:8080/StudentSystem/Student/academy_id/getScoreAcademyListStudent?current_page=1&class_id=1002
	@GetMapping("/academy_id/getScoreAcademyListStudent")
	public Object getAcademyIdScoreAcademyList(@RequestParam("current_page") Integer current_page, @RequestParam("class_id") Integer class_id) {
		List<scoreStudentsListWithScoreClassList> result = 
				Studentdao.getClassIPageWithOther((current_page-1)*PageEnum.CURRENTLIMIT.getDefualtlimit(), PageEnum.CURRENTLIMIT.getDefualtlimit(),class_id);
		if (result.size()>0) {
			ListDataVO<scoreStudentsListWithScoreClassList> dataVO = new ListDataVO<>();
			dataVO.setCode(1);
			dataVO.setMsg("查询成功，第"+current_page+"页");
			dataVO.setData(result);
			return dataVO;
		} else {
			BooleanDataVO dataVO = new BooleanDataVO();
			dataVO.setCode(0);
			dataVO.setMsg("没有数据");
			dataVO.setData(false);
			return dataVO;
		}
	};
	

}
