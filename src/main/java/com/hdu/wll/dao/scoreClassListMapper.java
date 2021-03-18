package com.hdu.wll.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdu.wll.entity.scoreClassList;
import com.hdu.wll.pojo.ScoreClassAdminWitScoreClassListWithScoreAcademyList;
import com.hdu.wll.pojo.scoreClassListWithScoreAcademyList;

@Repository
public interface scoreClassListMapper extends BaseMapper<scoreClassList>{

	
	List<scoreClassListWithScoreAcademyList> getClassIPageWithOther(@Param("page") int page, @Param("limit") int limit, @Param("academy_id") int academy_id);
	
	List<scoreClassListWithScoreAcademyList> getClassAll(@Param("academy_id") int academy_id);
	
	
	List<ScoreClassAdminWitScoreClassListWithScoreAcademyList> getIPageWithOther(@Param("page") int page, @Param("limit") int limit, @Param("academy_id") int academy_id);
	
	List<ScoreClassAdminWitScoreClassListWithScoreAcademyList> getAll(@Param("academy_id") int academy_id);
}
