package com.hdu.wll.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdu.wll.entity.scoreAcademyAdmin;
import com.hdu.wll.pojo.scoreAcademyAdminWithscoreAcademyList;

@Repository
public interface scoreAcademyAdminMapper extends BaseMapper<scoreAcademyAdmin>{

	
	List<scoreAcademyAdminWithscoreAcademyList> getIPageWithOther(@Param("page") int page, @Param("limit") int limit);
	
	List<scoreAcademyAdminWithscoreAcademyList> getAllList();
}
