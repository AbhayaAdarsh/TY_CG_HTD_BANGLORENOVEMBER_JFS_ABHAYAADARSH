package com.capge.flipkart.service;

import java.util.List;

import com.capge.flipkart.bean.ProductBean;
import com.capge.flipkart.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{

	ProductDaoImpl dao=new ProductDaoImpl();
	@Override
	public boolean addProduct(ProductBean product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean deleteProduct(String pname) {
		return dao.deleteProduct(pname);
	}

	@Override
	public boolean editProduct(ProductBean product) {
		return dao.editProduct(product);
	}

	@Override
	public ProductBean getProduct(String pname) {
		return null;
	}

	@Override
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

}
