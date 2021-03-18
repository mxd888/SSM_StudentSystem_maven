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

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.hdu.wll.Enum.PageEnum;
import com.hdu.wll.bean.scoreClassAdminBean;
import com.hdu.wll.dao.scoreClassAdminMapper;
import com.hdu.wll.dao.scoreClassListMapper;
import com.hdu.wll.entity.scoreClassAdmin;
import com.hdu.wll.entity.scoreClassList;
import com.hdu.wll.pojo.ScoreClassAdminWitScoreClassListWithScoreAcademyList;
import com.hdu.wll.pojo.scoreClassListWithScoreAcademyList;
import com.hdu.wll.vo.BooleanDataVO;
import com.hdu.wll.vo.ListDataVO;
import com.hdu.wll.vo.ObjectData;

@CrossOrigin
@RestController("ClassAdminController")
@RequestMapping("Class")
public class ClassAdminController {
	
	

	@Autowired
	private scoreClassListMapper scoreClassListdao;
	
	@Autowired
	private scoreClassAdminMapper scoreClassAdmindao;
	
	
	@PostMapping("/insertClass")
	public Object insert(@RequestBody com.hdu.wll.bean.scoreClassListBean scoreClassListBean) {
		scoreClassList scoreClassList = new scoreClassList();
		scoreClassList.setClassListName(scoreClassListBean.getClass_name());
		scoreClassList.setClassStudentsCount(scoreClassListBean.getStudents_count());
		scoreClassList.setAcademyId(scoreClassListBean.getAcademy_id());
		int i = scoreClassListdao.insert(scoreClassList);
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
	
	
	@GetMapping("/deleteClass")
	public Object delete(@RequestParam("class_id") int id) {
		QueryWrapper<scoreClassList> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("class_id", id);
		int i = scoreClassListdao.delete(queryWrapper);
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
	
	
	@PostMapping("/updateClass")
	public Object update(@RequestBody com.hdu.wll.bean.scoreClassListBean scoreClassListBean) {
		scoreClassList scoreClassList = new scoreClassList();
		scoreClassList.setClassId(scoreClassListBean.getClass_id());
		scoreClassList.setClassListName(scoreClassListBean.getClass_name());
		scoreClassList.setClassStudentsCount(scoreClassListBean.getStudents_count());
		scoreClassList.setAcademyId(scoreClassListBean.getAcademy_id());
		UpdateWrapper<scoreClassList> updateWrapper = new UpdateWrapper<>();
		updateWrapper.eq("class_id", scoreClassListBean.getClass_id());
		int i = scoreClassListdao.update(scoreClassList, updateWrapper);
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
	
	
	
	@GetMapping("/academy_id/getScoreAcademyListClass")
	public Object getAcademyIdScoreAcademyList(@RequestParam("current_page") int current_page, @RequestParam("academy_id") int academy_id) {
		List<scoreClassListWithScoreAcademyList> result = 
				scoreClassListdao.getClassIPageWithOther((current_page-1)*PageEnum.CURRENTLIMIT.getDefualtlimit(), PageEnum.CURRENTLIMIT.getDefualtlimit(),academy_id);
		if (result.size()>0) {
			ListDataVO<scoreClassListWithScoreAcademyList> dataVO = new ListDataVO<>();
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
	
	
	
	@GetMapping("/academy_id/getAllClass")
	public Object getAcademyIdAll(@RequestParam("academy_id") int academy_id) {
		List<scoreClassListWithScoreAcademyList> result = scoreClassListdao.getClassAll(academy_id);
		if (result.size()>0) {
			ListDataVO<scoreClassListWithScoreAcademyList> dataVO = new ListDataVO<>();
			dataVO.setCode(1);
			dataVO.setMsg("查询成功，共"+result.size()+"条数据");
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
	
	
	
	
	
	@GetMapping("/classAdmin/getScoreClassAdminWitScoreClassListWithScoreAcademyListClass")
	public Object getScoreAcademyList(@RequestParam("current_page") int current_page, @RequestParam("academy_id") int academy_id) {
		List<ScoreClassAdminWitScoreClassListWithScoreAcademyList> result = 
				scoreClassListdao.getIPageWithOther((current_page-1)*PageEnum.CURRENTLIMIT.getDefualtlimit(), PageEnum.CURRENTLIMIT.getDefualtlimit(),academy_id);
		if (result.size()>0) {
			ListDataVO<ScoreClassAdminWitScoreClassListWithScoreAcademyList> dataVO = new ListDataVO<>();
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
	
	
	
	@GetMapping("/classAdmin/getAllClass")
	public Object getAll(@RequestParam("academy_id") int academy_id) {
		List<ScoreClassAdminWitScoreClassListWithScoreAcademyList> result = scoreClassListdao.getAll(academy_id);
		if (result.size()>0) {
			ListDataVO<ScoreClassAdminWitScoreClassListWithScoreAcademyList> dataVO = new ListDataVO<>();
			dataVO.setCode(1);
			dataVO.setMsg("查询成功，共"+result.size()+"条数据");
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
	
	
	@PostMapping("/classAdmin/insertClass")
	public Object insert(@RequestBody scoreClassAdminBean scoreClassAdminBean) {
		scoreClassAdmin scoreClassAdmin = new scoreClassAdmin();
		scoreClassAdmin.setClassAdminUsername(scoreClassAdminBean.getUser_name());
		scoreClassAdmin.setClassAdminPassword(scoreClassAdminBean.getUser_pass());
		scoreClassAdmin.setClassAdminName(scoreClassAdminBean.getUser_truname());
		scoreClassAdmin.setClassId(scoreClassAdminBean.getClass_id());
		scoreClassAdmin.setAcademyId(scoreClassAdminBean.getAcademy_id());
		int i = scoreClassAdmindao.insert(scoreClassAdmin);
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
	
	
	@GetMapping("/classAdmin/deleteClass")
	public Object classAdminDelete(@RequestParam("id") int id) {
		int i = scoreClassAdmindao.deleteById(id);
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
	
	
	@PostMapping("/classAdmin/updateClass")
	public Object classAdminUpdate(@RequestBody scoreClassAdminBean scoreClassAdminBean) {
		scoreClassAdmin scoreClassAdmin = new scoreClassAdmin();
		scoreClassAdmin.setId(scoreClassAdminBean.getId());
		scoreClassAdmin.setClassAdminUsername(scoreClassAdminBean.getUser_name());
		scoreClassAdmin.setClassAdminPassword(scoreClassAdminBean.getUser_pass());
		scoreClassAdmin.setClassAdminName(scoreClassAdminBean.getUser_truname());
		scoreClassAdmin.setClassId(scoreClassAdminBean.getClass_id());
		scoreClassAdmin.setAcademyId(scoreClassAdminBean.getAcademy_id());
		int i = scoreClassAdmindao.updateById(scoreClassAdmin);
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
	
	
	@GetMapping("/classAdmin/loginClass")
	public Object classAdminLogin(@RequestParam("user_name") String user_name,@RequestParam("user_pass") String user_pass) {
		QueryWrapper<scoreClassAdmin> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("class_admin_username", user_name);
		queryWrapper.eq("class_admin_password", user_pass);
		scoreClassAdmin result = scoreClassAdmindao.selectOne(queryWrapper);
		
		if (result != null) {
			ObjectData<scoreClassAdmin> dataVO = new ObjectData<>();
			dataVO.setCode(1);
			dataVO.setMsg("登录成功");
			dataVO.setData(result);
			return dataVO;
		} else {
			BooleanDataVO dataVO = new BooleanDataVO();
			dataVO.setCode(0);
			dataVO.setMsg("登录失败");
			dataVO.setData(false);
			return dataVO;
		}
		
	};
	

}
