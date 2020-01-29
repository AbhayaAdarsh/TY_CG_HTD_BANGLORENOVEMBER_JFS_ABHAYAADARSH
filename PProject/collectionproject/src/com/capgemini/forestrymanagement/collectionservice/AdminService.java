package com.capgemini.forestrymanagement.collectionservice;

import com.capgemini.forestrymanagement.collectionbean.AdminBean;

public interface AdminService {
	public AdminBean adminLogin(int adminId, String adminName, String password);
}
