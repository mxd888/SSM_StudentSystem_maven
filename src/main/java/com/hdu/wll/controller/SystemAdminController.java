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
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hdu.wll.Enum.PageEnum;
import com.hdu.wll.bean.SystemAdminUpdateInfo;
import com.hdu.wll.dao.scoreAcademyListMapper;
import com.hdu.wll.entity.scoreAcademyList;
import com.hdu.wll.pojo.SystemAdminInfo;
import com.hdu.wll.service.SystemAdminService;
import com.hdu.wll.vo.BooleanDataVO;
import com.hdu.wll.vo.ListDataVO;
import com.hdu.wll.vo.ObjectData;


@CrossOrigin
@RestController("SystemAdminController")
@RequestMapping("SystemAdmin")
public class SystemAdminController {

	@Autowired
	private SystemAdminService systemAdminService;
	
	@Autowired
	private scoreAcademyListMapper systemAdmindao;

	@GetMapping("/studentLoginSystemAdmin")
	public Object StudentLogin(@RequestParam("user_name") String username, @RequestParam("user_pass") String pass) {
		boolean b = systemAdminService.Login(username, pass);
		if (b) {
			SystemAdminInfo Info = systemAdminService.getInfo(username, pass);
			ObjectData<SystemAdminInfo> dataVO = new ObjectData<>();
			dataVO.setCode(1);
			dataVO.setMsg("登录成功");
			dataVO.setData(Info);
			return dataVO;
		} else {
			BooleanDataVO dataVO = new BooleanDataVO();
			dataVO.setCode(0);
			dataVO.setMsg("登录失败");
			dataVO.setData(b);
			return dataVO;
		}
	};

	@PostMapping("/update/infoSystemAdmin")
	public Object updateInfo(@RequestBody SystemAdminUpdateInfo system) {
		boolean b = systemAdminService.update(system);
		BooleanDataVO dataVO = new BooleanDataVO();
		if (b) {
			dataVO.setCode(1);
			dataVO.setMsg("更新成功");
			dataVO.setData(b);
		} else {
			dataVO.setCode(0);
			dataVO.setMsg("更新失败");
			dataVO.setData(b);
		}
		return dataVO;

	};
	
	
	@GetMapping("/getScoreAcademyListSystemAdmin")
	public Object getScoreAcademyList(@RequestParam("current_page") int current_page) {
		IPage<scoreAcademyList> page = new Page<>(current_page,PageEnum.CURRENTLIMIT.getDefualtlimit());
		IPage<scoreAcademyList> result = systemAdmindao.selectPage(page, null);
		if (result.getTotal()>0) {
			ListDataVO<scoreAcademyList> dataVO = new ListDataVO<>();
			dataVO.setCode(1);
			dataVO.setMsg("查询成功，第"+current_page+"页");
			dataVO.setData(result.getRecords());
			return dataVO;
		} else {
			BooleanDataVO dataVO = new BooleanDataVO();
			dataVO.setCode(0);
			dataVO.setMsg("没有数据");
			dataVO.setData(false);
			return dataVO;
		}
	};
	
	
	
	@GetMapping("/insertSystemAdmin")
	public Object insert(@RequestParam("academy_name") String academy_name) {
		scoreAcademyList scoreAcademyList = new scoreAcademyList();
		scoreAcademyList.setAcademyName(academy_name);
		int b = systemAdmindao.insert(scoreAcademyList);
		BooleanDataVO dataVO = new BooleanDataVO();
		if (b > 0) {
			dataVO.setCode(1);
			dataVO.setMsg("新增成功");
			dataVO.setData(b > 0);
		} else {
			dataVO.setCode(0);
			dataVO.setMsg("新增失败");
			dataVO.setData(b > 0);
			
		}
		return dataVO;
	};
	
	
	@GetMapping("/deleteSystemAdmin")
	public Object delete(@RequestParam("academy_id") int id) {
		int b = systemAdmindao.deleteById(id);
		BooleanDataVO dataVO = new BooleanDataVO();
		if (b > 0) {
			dataVO.setCode(1);
			dataVO.setMsg("删除成功");
			dataVO.setData(b > 0);
		} else {
			dataVO.setCode(0);
			dataVO.setMsg("删除失败");
			dataVO.setData(b > 0);
			
		}
		return dataVO;
	};
	
	
	
	@PostMapping("/updateSystemAdmin")
	public Object update(@RequestBody scoreAcademyList scoreAcademyList) {
		UpdateWrapper<scoreAcademyList> updateWrapper = new UpdateWrapper<>();
		updateWrapper.eq("academy_id", scoreAcademyList.getAcademyId());
		int b = systemAdmindao.update(scoreAcademyList, updateWrapper);
		BooleanDataVO dataVO = new BooleanDataVO();
		if (b > 0) {
			dataVO.setCode(1);
			dataVO.setMsg("操作成功");
			dataVO.setData(b > 0);
		} else {
			dataVO.setCode(0);
			dataVO.setMsg("操作失败");
			dataVO.setData(b > 0);
			
		}
		return dataVO;
	};
	
	
	@GetMapping("/getAllSystemAdmin")
	public Object getAll() {
		List<scoreAcademyList> list = systemAdmindao.selectList(null);
		ListDataVO<scoreAcademyList> dataVO= new ListDataVO<>();
		if (list.size() > 0) {
			dataVO.setCode(1);
			dataVO.setMsg("成功");
			dataVO.setData(list);
		} else {
			dataVO.setCode(0);
			dataVO.setMsg("成功");
			dataVO.setData(null);
			
		}
		return dataVO;
	};
	

}
