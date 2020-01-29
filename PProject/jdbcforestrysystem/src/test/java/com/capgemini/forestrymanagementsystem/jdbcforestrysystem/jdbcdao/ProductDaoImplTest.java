package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ProductBean;

public class ProductDaoImplTest {
	ProductBean productBean = null;
    ProductDaoImpl productDao = null;
    @BeforeEach
    void loadDriver() {
   productDao = new ProductDaoImpl();
    }
	public void testAddProduct() {
		productBean = new ProductBean();
		productBean.setProductId(77);
		productBean.setProductName("timber");
		productBean.setDeliveryDate("09-08-2020");
		productBean.setQuantity(98767);
	    boolean check = productDao.addProduct(productBean);
		  assertTrue(check);
	}

	public void testDeleteProduct() {
		int productId = 77;
		    boolean check = productDao.deleteProduct(productId);
		    assertEquals(check,true);
		
	}

}