package com.capgemini.retailermaintenancesystemapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.capgemini.retailermaintenancesystemapplication.dao.UserInfoDao;
import com.capgemini.retailermaintenancesystemapplication.dto.UserInfoBean;
import com.capgemini.retailermaintenancesystemapplication.exception.UserInfoException;

public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoDao dao;
	
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	
	@Override
	public boolean addUserInfoProfile(UserInfoBean bean) {
		return dao.addUserInfoProfile(bean);
	}

	@Override
	public UserInfoBean getUserInfo(int id) {
		return dao.getUserInfo(id);
	}

	@Override
	public boolean updatePassword(int email, String password) {
		return dao.updatePassword(email,  password);
	}

	@Override
	public List<UserInfoBean> getAllUser(int id) throws UserInfoException {
		return dao.getAllUser(id);
	}

	@Override
	public boolean getAllUser(UserInfoBean bean) {
		return false;
	}

	@Override
	public boolean updateUser(int id, UserInfoBean bean1) {
		return false;
	}

	@Override
	public List<UserInfoBean> getAllUser() {
		return null;
	}

}
