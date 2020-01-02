package com.capgemini.productspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.productspringboot.dao.ProductDAO;
import com.capgemini.productspringboot.dto.ProductBean;
import com.capgemini.productspringboot.exception.ProductException;

public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public ProductBean getProduct(int id) {
		return dao.getProduct(id);
	}

	@Override
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public boolean updateProduct(int id, ProductBean bean) {
		return dao.updateProduct(id,bean);
	}

	@Override
	public boolean deleteProduct(int id) throws ProductException {
		return dao.deleteProduct(id);
	}


}
