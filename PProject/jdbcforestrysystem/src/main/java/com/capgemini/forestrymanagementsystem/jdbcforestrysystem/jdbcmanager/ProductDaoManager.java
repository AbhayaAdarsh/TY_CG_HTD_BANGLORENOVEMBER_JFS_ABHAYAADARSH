package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.ProductDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.ProductDaoImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.ProductServiceImpl;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.ProductServices;

public class ProductDaoManager {

	public static ProductDao instanceOfProductDaoImpl() {
		ProductDao dao = new ProductDaoImpl();
		return dao;
	}

	public static ProductServices instanceOfProductServiceImpl() {
		ProductServiceImpl services = new ProductServiceImpl();
		return services;
	}
}
