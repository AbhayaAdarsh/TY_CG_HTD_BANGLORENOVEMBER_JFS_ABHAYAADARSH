package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.AdminBean;

public interface AdminService {
	public int AuthenticateAdmin(AdminBean adminbean);

	public int AuthenticateClient(AdminBean adminbean);

	public int AuthenticateSchedular(AdminBean adminbean);
}
