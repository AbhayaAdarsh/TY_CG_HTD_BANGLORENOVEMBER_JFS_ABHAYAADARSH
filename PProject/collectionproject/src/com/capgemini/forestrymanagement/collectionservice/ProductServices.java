package com.capgemini.forestrymanagement.collectionservice;

import com.capgemini.forestrymanagement.collectionbean.ProductBean;

public interface ProductServices {
	boolean addProduct(ProductBean bean);

	boolean modifyProduct(ProductBean bean);

	boolean deleteProduct(int productid);

	boolean addProduct1(ProductBean bean);
	boolean modifyProduct1(ProductBean bean);
}
