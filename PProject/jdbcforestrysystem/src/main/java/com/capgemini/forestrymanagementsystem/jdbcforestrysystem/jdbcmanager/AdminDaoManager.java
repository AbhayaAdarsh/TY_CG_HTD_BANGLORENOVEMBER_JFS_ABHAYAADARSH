package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.AdminDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.AdminDaoImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.AdminService;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.AdminServiceImpl;

public class AdminDaoManager {
	public static AdminDao instanceOfAdminDaoImpl() {
		AdminDao dao = new AdminDaoImpl();
		return dao;
	}

	public static AdminService instanceOfAdminServiceImpl() {
		AdminServiceImpl services = new AdminServiceImpl();
		return services;
	}
}
