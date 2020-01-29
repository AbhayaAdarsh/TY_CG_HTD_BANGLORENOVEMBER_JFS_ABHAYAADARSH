package com.capgemini.forestrymanagement.springbootdao;

import com.capgemini.forestrymanagement.springbootdto.ProductBean;

public interface ProductDao {

	boolean addProduct(ProductBean bean);

	boolean deleteProduct(int productId);

	boolean updateProduct(ProductBean bean);

	boolean registerProduct(ProductBean bean);

}
