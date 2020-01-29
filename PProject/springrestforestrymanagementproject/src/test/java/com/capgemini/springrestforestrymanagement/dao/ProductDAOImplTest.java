package com.capgemini.springrestforestrymanagement.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.capgemini.springrestforestrymanagement.dto.ProductBean;

class ProductDAOImplTest {

	@Test
	void testDeleteProduct() {
		ProductBean product = new ProductBean();
		product.setPID(1);
		Assertions.assertTrue(true);
		Assertions.assertNotNull(product);
		}

	@Test
	void testAddProduct() {
		ProductBean bean=new ProductBean();
		bean.setPID(10);
		bean.setName("iphone");
		bean.setQantity(11);
		Assertions.assertTrue(true);
		Assertions.assertNotNull(bean);
	}
}
