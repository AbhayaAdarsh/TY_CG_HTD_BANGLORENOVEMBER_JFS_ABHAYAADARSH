package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ProductBean;

public interface ProductServices {
	boolean addProduct(ProductBean bean);

	boolean modifyProduct(ProductBean bean);

	boolean deleteProduct(int productid);
}
