package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.SchedularDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.SchedularDaoImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.SchedularServiceImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.SchedularServices;

public class SchedularDaoManager {

	public static SchedularDao instanceOfSchedularDaoImpl() {
		SchedularDao dao = new SchedularDaoImpl();
		return dao;
	}

	public static SchedularServices instanceOfSchedularServiceImpl() {
		SchedularServiceImpl services = new SchedularServiceImpl();
		return services;
	}
}
