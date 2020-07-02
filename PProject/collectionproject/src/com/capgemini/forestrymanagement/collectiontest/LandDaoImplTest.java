package com.capgemini.forestrymanagement.collectiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.forestrymanagement.collectionbean.LandBean;
import com.capgemini.forestrymanagement.collectiondao.LandDaoImpl;

class LandDaoImplTest {
	LandBean land = new LandBean();
	LandDaoImpl dao = new LandDaoImpl();
	@Test
	void testAddLand() {
		LandBean land=new LandBean();
		land.setLandNo(102);
		land.setLandDetails("HSR Layout,Bangalore");
		land.setLandlordName("Prince");
		try {
			boolean flag = dao.addLand(land);
			assertEquals(flag, true);
		} catch (Exception e) {
				dao.addLand(land);
		}
	}

	@Test
	void testDeleteLand() {
		land=new LandBean();
		land.setLandNo(102);
		try {
			boolean flag = dao.deleteLand(land.getLandNo());
			assertEquals(flag, false);
		} catch (Exception e) {
			dao.deleteLand(land.getLandNo());
		}	
	}
	
	@Test
	void testGetAllInfoLand() {
		land=new LandBean();
		try {
			dao.getAllInfoLand();
			assertEquals(dao, dao);
		} catch (Exception e) {
			dao.getAllInfoLand();
		}
	}

}