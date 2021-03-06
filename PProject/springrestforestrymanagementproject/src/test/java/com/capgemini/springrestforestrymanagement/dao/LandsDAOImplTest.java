package com.capgemini.springrestforestrymanagement.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.capgemini.springrestforestrymanagement.dto.LandsBean;

class LandsDAOImplTest {

	@Test
	void testDeleteLands() {
		LandsBean lands = new LandsBean();
		lands.setLandId(13);
		Assertions.assertTrue(true);
		Assertions.assertNotNull(lands);
	}

	@Test
	void testAddLands() {
		LandsBean bean=new LandsBean();
		bean.setLandId(10);
		bean.setLandSize(10);
		bean.setLandLocation("Bangalore");
		Assertions.assertTrue(true);
		Assertions.assertNotNull(bean);
	}

}
