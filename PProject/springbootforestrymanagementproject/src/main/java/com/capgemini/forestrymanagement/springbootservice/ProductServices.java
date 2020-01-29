package com.capgemini.forestrymanagement.springbootservice;

import java.util.List;

import com.capgemini.forestrymanagement.springbootdto.ProductBean;

public interface ProductServices {

	boolean addProduct(ProductBean bean);

	boolean deleteProduct(int productid);

	boolean updateProduct(ProductBean bean);

	boolean registerProduct(ProductBean bean);

	ProductBean getProductBean(int productId);

	List<ProductBean> getAllProduct();
}