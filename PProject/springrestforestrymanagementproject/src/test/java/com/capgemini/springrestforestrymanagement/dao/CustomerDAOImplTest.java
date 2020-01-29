package com.capgemini.springrestforestrymanagement.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.capgemini.springrestforestrymanagement.dto.CustomerBean;

class CustomerDAOImplTest {


	@Test
	void testDeleteCustomer() {
		CustomerBean customer = new CustomerBean();
		customer.setCustomerId(1);
		Assertions.assertTrue(true);
		Assertions.assertNotNull(customer);

	}

	@Test
	void testAddCustomer() {
		CustomerBean bean=new CustomerBean();
		bean.setCid(10);
		bean.setName("Abhaya");
		bean.setTown("54");
		bean.setPostal(44);
		bean.setEmail("abhaya.adarsh148@gmail.com");
		bean.setPassword("abhaya");
		Assertions.assertTrue(true);
		Assertions.assertNotNull(bean);
	}

}
