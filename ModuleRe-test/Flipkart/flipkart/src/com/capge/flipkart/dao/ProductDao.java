package com.capge.flipkart.dao;

import java.util.List;

import com.capge.flipkart.bean.ProductBean;

public interface ProductDao {

	boolean addProduct(ProductBean product);
	boolean deleteProduct(String pname);
	boolean editProduct(ProductBean product);
	ProductBean getProduct(String pname);
	public List<ProductBean> getAllProduct();
}
