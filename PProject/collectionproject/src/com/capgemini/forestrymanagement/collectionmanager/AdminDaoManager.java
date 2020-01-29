package com.capgemini.forestrymanagement.collectionmanager;

import com.capgemini.forestrymanagement.collectiondao.AdminDao;
import com.capgemini.forestrymanagement.collectiondao.AdminDaoImpl;

public class AdminDaoManager {
	public static AdminDao getAdmindao() {
		return new AdminDaoImpl();
	}

	public static AdminDao instanceOfAdminDaoImpl() {
		return null;
	}
}
