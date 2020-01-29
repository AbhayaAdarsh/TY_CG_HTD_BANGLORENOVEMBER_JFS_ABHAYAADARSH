package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.ContractorDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.ContractorDaoImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.ContractorServiceImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.ContractorServices;

public class ContractorDaoManager {

	public static ContractorDao instanceOfContractorDaoImpl() {
		ContractorDao dao = new ContractorDaoImpl();
		return dao;
	}

	public static ContractorServices instanceOfContractorServiceImpl() {
		ContractorServiceImpl services = new ContractorServiceImpl();
		return services;
	}
}