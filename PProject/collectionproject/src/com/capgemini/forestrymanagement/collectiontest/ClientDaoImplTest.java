package com.capgemini.forestrymanagement.collectiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.forestrymanagement.collectionbean.ClientBean;
import com.capgemini.forestrymanagement.collectiondao.ClientDaoImpl;

class ClientDaoImplTest {
	ClientBean clientBean = null;
    ClientDaoImpl clientDao = null;
    @BeforeEach
    void loadDriver() {
   clientDao = new ClientDaoImpl();
    }
	@Test
	void testAddClient() {
		ClientBean client=new ClientBean();
		client.setClientId(01);
		client.setClientName("Abhaya");
		client.setStreetAddress1("JustBooks,BtmLayout");
		client.setStreetAddress2("SaiRam Girls Pg");
		client.setTown("Btm Layout");
		client.setPostalCode(560076);
		client.setEmail("abhaya.adarsh148@gmail.com");
		client.setTelephoneNum("7903517993");
		try {
			boolean flag = clientDao.addClient(client);
			assertEquals(flag, true);
		} catch (Exception e) {
			clientDao.addClient(client);
		}
	}

	@Test
	void testDeleteClient() {
		int clientId = 77;
	    boolean check = clientDao.deleteClient(clientId);
	    assertEquals(check,false);
	}

	@Test
	void testGetAllClient() {
		try {
			List<ClientBean> check = clientDao.getAllClient();
			assertEquals(check!=null,true);
			}catch(Exception e) {
				clientDao.getAllClient();
			}
	  }

}