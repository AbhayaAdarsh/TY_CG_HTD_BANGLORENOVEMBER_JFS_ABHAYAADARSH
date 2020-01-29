package com.capgemini.forestrymanagement.collectiondao;

import java.util.List;

import com.capgemini.forestrymanagement.collectionbean.AdminBean;

public interface AdminDao {
	public boolean addMain(AdminBean adminbean);

	public boolean removeMain(String userName);

	public List<AdminBean> showMain();

	public AdminBean adminLogin(int adminId, String adminName, String password);
}
