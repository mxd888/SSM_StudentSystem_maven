package com.hdu.wll.service;

import com.hdu.wll.bean.SystemAdminUpdateInfo;
import com.hdu.wll.pojo.SystemAdminInfo;

public interface SystemAdminService {

	boolean update(SystemAdminUpdateInfo system);

	boolean Login(String username, String pass);

	SystemAdminInfo getInfo(String username, String pass);

}
