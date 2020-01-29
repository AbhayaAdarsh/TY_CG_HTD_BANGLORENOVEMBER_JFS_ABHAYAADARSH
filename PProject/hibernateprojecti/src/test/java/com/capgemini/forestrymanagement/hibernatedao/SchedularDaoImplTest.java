package com.capgemini.forestrymanagement.hibernatedao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.capgemini.forestrymanagement.hibernatebean.SchedularBean;


class SchedularDaoImplTest {
	SchedularBean schedularBean = null;
	SchedularDao schedularDao = null;
	@BeforeEach
	void load() {
		schedularDao = new SchedularDaoImpl();
	}
	@Test
	void testAddSchedular() {
		schedularBean = new SchedularBean();
	
		schedularBean.setschedularQuantity(21);
		schedularBean.setschedulerName("Abhaya");
		schedularBean.setschedulerId(101);
		schedularBean.setProductId(101);
		schedularBean.setDeliveryDate("12/12/2019");
		boolean check = schedularDao.addSchedular(schedularBean);
		assertTrue(check);
	}

//	@Test
//	void testModifySchedular() {
//	}

	@Test
	void testDeleteSchedular() {
		int schedularId =67;
	    boolean check = schedularDao.deleteSchedular(schedularId);
	    assertEquals(check,true); 
	}

}
