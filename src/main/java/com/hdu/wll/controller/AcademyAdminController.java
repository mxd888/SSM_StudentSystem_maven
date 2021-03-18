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
import com.hdu.wll.bean.ScoreAcademyAdminInfo;
import com.hdu.wll.bean.timeInfo;
import com.hdu.wll.dao.scoreAcademyAdminMapper;
import com.hdu.wll.dao.scoreInputTimeMapper;
import com.hdu.wll.entity.scoreAcademyAdmin;
import com.hdu.wll.entity.scoreInputTime;
import com.hdu.wll.pojo.scoreAcademyAdminWithscoreAcademyList;
import com.hdu.wll.util.CurrentTime;
import com.hdu.wll.vo.BooleanDataVO;
import com.hdu.wll.vo.ListDataVO;
import com.hdu.wll.vo.ObjectData;

@CrossOrigin
@RestController("AcademyAdminController")
@RequestMapping("AcademyAdmin")
public class AcademyAdminController {

	
	@Autowired
	private scoreAcademyAdminMapper scoreAcademyAdmindao;
	
	
	@Autowired
	private scoreInputTimeMapper scoreInputTimedao;
	
	@GetMapping("/getScoreAcademyListAcademyAdmin")
	public Object getScoreAcademyList(@RequestParam("current_page") int current_page) {
		List<scoreAcademyAdminWithscoreAcademyList> result = scoreAcademyAdmindao.getIPageWithOther((current_page-1)*PageEnum.CURRENTLIMIT.getDefualtlimit(), PageEnum.CURRENTLIMIT.getDefualtlimit());
		if (result.size()>0) {
			ListDataVO<scoreAcademyAdminWithscoreAcademyList> dataVO = new ListDataVO<>();
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
	
	
	
	@PostMapping("/insertAcademyAdmin")
	public Object insert(@RequestBody scoreAcademyAdmin scoreAcademyAdmin) {
		int i = scoreAcademyAdmindao.insert(scoreAcademyAdmin);
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
	
	
	@GetMapping("/deleteAcademyAdmin")
	public Object delete(@RequestParam("id") int id) {
		int i = scoreAcademyAdmindao.deleteById(id);
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
	
	
	@PostMapping("/updateAcademyAdmin")
	public Object update(@RequestBody ScoreAcademyAdminInfo scoreAcademyAdminInfo) {
		scoreAcademyAdmin entity = new scoreAcademyAdmin();
		entity.setId(scoreAcademyAdminInfo.getUser_name());
		entity.setAcademyAdminPassword(scoreAcademyAdminInfo.getUser_pass());
		entity.setAcademyAdminUsername(scoreAcademyAdminInfo.getUser_truename());
		int i = scoreAcademyAdmindao.updateById(entity);
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
	
	// http://127.0.0.1:8080/StudentSystem/AcademyAdmin/getAllAcademyAdmin
	@GetMapping("/getAllAcademyAdmin")
	public Object getAll() {
		List<scoreAcademyAdmin> result = scoreAcademyAdmindao.selectList(null);
		if (result.size()>0) {
			ListDataVO<scoreAcademyAdmin> dataVO = new ListDataVO<>();
			dataVO.setCode(1);
			dataVO.setMsg("查询成功");
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
	
	
	@GetMapping("/loginAcademyAdmin")
	public Object login(@RequestParam("user_name") String user_name, @RequestParam("user_pass") String user_pass) {
		QueryWrapper<scoreAcademyAdmin> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("academy_admin_username", user_name);
		queryWrapper.eq("academy_admin_password", user_pass);
		scoreAcademyAdmin result = scoreAcademyAdmindao.selectOne(queryWrapper);
		ObjectData<scoreAcademyAdmin> dataVO = new ObjectData<>();
		if (result != null) {
			dataVO.setCode(1);
			dataVO.setMsg("成功");
			dataVO.setData(result);
			
		} else {
			dataVO.setCode(0);
			dataVO.setMsg("失败");
			dataVO.setData(null);
		}
		return dataVO;
	};
	
	
	

	@PostMapping("/time/insert")
	public Object timeinsert(@RequestBody timeInfo timeInfo) {
		scoreInputTime scoreInputTime = new scoreInputTime();
		scoreInputTime.setTermName(timeInfo.getTerm_name());
		scoreInputTime.setTermStartTime(CurrentTime.strToDate(timeInfo.getStart_time()));
		scoreInputTime.setTermEndTime(CurrentTime.strToDate(timeInfo.getEnd_time()));
		int i = scoreInputTimedao.insert(scoreInputTime);
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
	
	
	@GetMapping("/time/delete")
	public Object timedelete(@RequestParam("id") int id) {
		QueryWrapper<scoreInputTime> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("term_id", id);
		int i = scoreInputTimedao.delete(queryWrapper);
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
	
	
	@PostMapping("/time/update")
	public Object timeupdate(@RequestBody timeInfo timeInfo) {
		scoreInputTime scoreInputTime = new scoreInputTime();
		scoreInputTime.setTermId(timeInfo.getTerm_id());
		scoreInputTime.setTermName(timeInfo.getTerm_name());
		scoreInputTime.setTermStartTime(CurrentTime.strToDate(timeInfo.getStart_time()));
		scoreInputTime.setTermEndTime(CurrentTime.strToDate(timeInfo.getEnd_time()));
		UpdateWrapper<scoreInputTime> updateWrapper = new UpdateWrapper<>();
		updateWrapper.eq("term_id", timeInfo.getTerm_id());
		int i = scoreInputTimedao.update(scoreInputTime, updateWrapper);
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
	
	
	@GetMapping("/time/getAll")
	public Object getTimeAll() {
		List<scoreInputTime> result = scoreInputTimedao.selectList(null);
		if (result.size()>0) {
			ListDataVO<scoreInputTime> dataVO = new ListDataVO<>();
			dataVO.setCode(1);
			dataVO.setMsg("查询成功");
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
