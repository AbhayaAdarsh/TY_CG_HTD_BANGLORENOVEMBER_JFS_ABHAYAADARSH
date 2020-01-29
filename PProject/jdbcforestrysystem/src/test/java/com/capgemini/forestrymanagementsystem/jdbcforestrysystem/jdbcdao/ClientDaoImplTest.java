package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ClientBean;

class ClientDaoImplTest {
	ClientBean clientBean = null;
    ClientDaoImpl clientDao = null;
    @BeforeEach
    void loadDriver() {
   clientDao = new ClientDaoImpl();
    }
	@Test
	void testAddClient() {
		ClientBean clientBean= new ClientBean();
		clientBean.setClientid(77);
		clientBean.setClientName("timber");
	    boolean check = clientDao.addClient(clientBean);
		  assertTrue(check);
	}

	@Test
	void testDeleteClient() {
		int clientId =67;
	    boolean check = clientDao.deleteClient(clientId);
	    assertEquals(check,true);  
	}

	@Test
	void testGetAllClient() {
			List<ClientBean> check = clientDao.getAllClient();
			assertEquals(check!=null,true);
			
	}

}
