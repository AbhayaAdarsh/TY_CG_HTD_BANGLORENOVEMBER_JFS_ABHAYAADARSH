package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.AdminBean;

public interface AdminDao {
	public int AuthenticateAdmin(AdminBean adminbean);

	public int AuthenticateClient(AdminBean adminbean);

	public int AuthenticateSchedular(AdminBean adminbean);
}