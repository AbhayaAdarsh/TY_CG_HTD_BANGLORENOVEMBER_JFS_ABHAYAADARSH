package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ProductBean;

public interface ProductDao {

	boolean addProduct(ProductBean bean);

	boolean modifyProduct(ProductBean bean);

	boolean deleteProduct(int productid);

}
