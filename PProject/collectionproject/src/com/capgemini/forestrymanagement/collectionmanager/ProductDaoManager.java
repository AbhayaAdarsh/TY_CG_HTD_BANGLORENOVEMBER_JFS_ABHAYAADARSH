package com.capgemini.forestrymanagement.collectionmanager;

import com.capgemini.forestrymanagement.collectiondao.ProductDao;
import com.capgemini.forestrymanagement.collectiondao.ProductDaoImpl;

public class ProductDaoManager 
{
	public static ProductDao getProductdao() {
		return new ProductDaoImpl();
	}

	public static ProductDao instanceOfProductDaoImpl() {
		return null;
	}

}
