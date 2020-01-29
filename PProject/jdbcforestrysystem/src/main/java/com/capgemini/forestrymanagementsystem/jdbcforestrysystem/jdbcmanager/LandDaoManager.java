package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.LandDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.LandDaoImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.LandServices;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.LandServicesImpl;

public class LandDaoManager {

	public static LandDao instanceOfLandDaoImpl() {
		LandDao dao = new LandDaoImpl();
		return dao;
	}

	public static LandServices instanceOfLandServiceImpl() {
		LandServicesImpl services = new LandServicesImpl();
		return services;
	}
}