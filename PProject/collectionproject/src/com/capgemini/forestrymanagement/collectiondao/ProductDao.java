package com.capgemini.forestrymanagement.collectiondao;

import com.capgemini.forestrymanagement.collectionbean.ProductBean;

public interface ProductDao {
	boolean addProduct(ProductBean bean);

	boolean modifyProduct(ProductBean bean);

	boolean deleteProduct(int productid);
}
