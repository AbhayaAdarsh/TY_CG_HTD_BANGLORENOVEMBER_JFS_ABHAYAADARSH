package com.capgemini.forestrymanagement.collectionjunittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.forestrymanagement.collectionbean.LandBean;
import com.capgemini.forestrymanagement.collectiondao.LandDaoImpl;

class LandDaoImplTest {
	LandBean landBean = null;
    LandDaoImpl landDao = null;
    @BeforeEach
    void loadDriver() {
   landDao = new LandDaoImpl();
    }
	@Test
	void testAddLand() {
		landBean = new LandBean();
		landBean.setLandNo(34);
		landBean.setLandDetails("Bangalore");
		boolean check = landDao.addLand(landBean);
		assertTrue(check);
	}

	@Test
	void testDeleteLand() {
		int landNo =67;
	    boolean check = landDao.deleteLand(landNo);
	    assertEquals(check,false);  
	}

}
