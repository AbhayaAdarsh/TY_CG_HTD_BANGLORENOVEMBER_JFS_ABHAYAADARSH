package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.ClientDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.ClientDaoImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.ClientServiceImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.ClientServices;

public class ClientDaoManager {

	public static ClientDao instanceOfClientDaoImpl() {
		ClientDao dao = new ClientDaoImpl();
		return dao;
	}

	public static ClientServices instanceOfClientServiceImpl() {
		ClientServiceImpl services = new ClientServiceImpl();
		return services;
	}
}
