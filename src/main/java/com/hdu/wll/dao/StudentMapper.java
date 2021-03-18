package com.hdu.wll.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdu.wll.entity.Student;
import com.hdu.wll.pojo.scoreStudentsListWithScoreClassList;

@Repository
public interface StudentMapper extends BaseMapper<Student>{

	List<scoreStudentsListWithScoreClassList> getClassIPageWithOther(@Param("page") int page, @Param("limit") int limit, @Param("class_id") int class_id);

}
