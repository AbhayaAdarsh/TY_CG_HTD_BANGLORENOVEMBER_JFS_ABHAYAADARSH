package com.capgemini.retailermaintenancesystemapplication.service;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplication.dto.UserInfoBean;
import com.capgemini.retailermaintenancesystemapplication.exception.UserInfoException;

public interface UserInfoService {

	public boolean addUserInfoProfile(UserInfoBean bean);
	public UserInfoBean getUserInfo(int id);
	public boolean updatePassword(int email,String password);
	List<UserInfoBean> getAllUser(int id) throws UserInfoException;
	boolean getAllUser(UserInfoBean bean);
	public boolean updateUser(int id, UserInfoBean bean1);
	public List<UserInfoBean> getAllUser();
}