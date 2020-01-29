package com.capgemini.forestrymanagement.collectionservice;

import com.capgemini.forestrymanagement.collectionbean.AdminBean;
import com.capgemini.forestrymanagement.collectiondao.AdminDao;
import com.capgemini.forestrymanagement.collectionmanager.AdminDaoManager;

public class AdminServiceImpl implements AdminService {
	AdminDao dao = AdminDaoManager.instanceOfAdminDaoImpl();

	@Override
	public AdminBean adminLogin(int adminId, String adminName, String password) {
		return dao.adminLogin(adminId, adminName, password);
	}

}
