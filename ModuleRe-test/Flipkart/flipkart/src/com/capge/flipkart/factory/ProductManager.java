package com.capge.flipkart.factory;

import com.capge.flipkart.dao.ProductDao;
import com.capge.flipkart.dao.ProductDaoImpl;
import com.capge.flipkart.service.ProductService;
import com.capge.flipkart.service.ProductServiceImpl;

public class ProductManager {

	public static ProductDao instanceOfProductDaoImpl(){
		ProductDao dao=new ProductDaoImpl();
		return dao;
	}

	public static ProductService instanceOfProductServicesImpl(){
		ProductService service=new ProductServiceImpl();
		return service;
	}
}
