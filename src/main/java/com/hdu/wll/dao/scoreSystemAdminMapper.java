package com.hdu.wll.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdu.wll.entity.scoreSystemAdmin;
import com.hdu.wll.pojo.SystemAdminInfo;

@Repository
public interface scoreSystemAdminMapper extends BaseMapper<scoreSystemAdmin>{

	SystemAdminInfo getInfoWithOther(@Param("username") String username,@Param("pass") String pass);
}
