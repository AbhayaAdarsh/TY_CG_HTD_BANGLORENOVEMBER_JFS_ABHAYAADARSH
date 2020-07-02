package com.capgemini.forestrymanagement.collectiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.forestrymanagement.collectionbean.ProductBean;
import com.capgemini.forestrymanagement.collectiondao.ProductDaoImpl;

class ProductDaoImplTest {
	ProductDaoImpl dao = new ProductDaoImpl();
	@Test
	void testAddProduct() {
		ProductBean product=new ProductBean();
        product.setProductid(102);
		product.setProductName("iPhone 11 pro");
		product.setQuantity(11);
		try {
			boolean flag = dao.addProduct(product);
			assertEquals(flag, true);
		} catch (Exception e) {
			dao.addProduct(product);
		}
	}

	@Test
	void testDeleteProduct() {
		ProductBean product=new ProductBean();
		product.setProductid(102);
		try {
			boolean flag = dao.deleteProduct(product.getProductid());
			assertEquals(flag, false);
		} catch (Exception e) {
			dao.deleteProduct(product.getProductid());
		}	
	}

}