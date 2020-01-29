package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.AdminBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.AdminDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.AdminDaoManager;

public class AdminServiceImpl implements AdminService {
	AdminDao dao = AdminDaoManager.instanceOfAdminDaoImpl();

	@Override
	public int AuthenticateAdmin(AdminBean adminbean) {
		return dao.AuthenticateAdmin(adminbean);
	}

	@Override
	public int AuthenticateClient(AdminBean adminbean) {
		return dao.AuthenticateClient(adminbean);
	}

	@Override
	public int AuthenticateSchedular(AdminBean adminbean) {
		return dao.AuthenticateSchedular(adminbean);
	}
}
