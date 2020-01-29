package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.SchedularBean;


class SchedularDaoImplTest {
	SchedularBean schedularBean = null;
	SchedularDaoImpl schedularDao = null;
	@BeforeEach
	void loadDriver() {
	schedularDao = new SchedularDaoImpl();
	}
	@Test
	void testAddSchedular() {
		schedularBean = new SchedularBean();
		schedularBean.setSchedulerId(67);
		schedularBean.setQuantity(21);
		boolean check = schedularDao.addSchedular(schedularBean);
		assertTrue(check);
	}

	@Test
	void testModifySchedular() {
	}

	@Test
	void testDeleteSchedular() {
		int schedularId =67;
	    boolean check = schedularDao.deleteSchedular(schedularId);
	    assertEquals(check,true); 
	}

}
