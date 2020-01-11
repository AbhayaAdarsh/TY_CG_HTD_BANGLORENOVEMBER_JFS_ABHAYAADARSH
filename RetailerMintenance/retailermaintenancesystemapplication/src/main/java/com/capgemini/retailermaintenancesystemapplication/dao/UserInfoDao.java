package com.capgemini.retailermaintenancesystemapplication.dao;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplication.dto.UserInfoBean;

public interface UserInfoDao {

	boolean addUserInfoProfile(UserInfoBean bean);

	UserInfoBean getUserInfo(int id);

	boolean updatePassword(int email, String password);

	List<UserInfoBean> getAllUser(int id);

}
