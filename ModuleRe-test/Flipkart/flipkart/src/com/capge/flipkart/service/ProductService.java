package com.capge.flipkart.service;

import java.util.List;

import com.capge.flipkart.bean.ProductBean;

public interface ProductService {

	boolean addProduct(ProductBean product);
	boolean deleteProduct(String pname);
	boolean editProduct(ProductBean product);
	ProductBean getProduct(String pname);
	public List<ProductBean> getAllProduct();
}
