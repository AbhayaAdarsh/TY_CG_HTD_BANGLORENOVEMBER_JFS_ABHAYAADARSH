package com.capgemini.forestrymanagement.collectionmanager;

import com.capgemini.forestrymanagement.collectiondao.ClientDao;
import com.capgemini.forestrymanagement.collectiondao.ClientDaoImpl;

public class ClientDaoManager {

	public static ClientDao getClientdao() {
		return new ClientDaoImpl();
	}

	public static ClientDao instanceOfClientDaoImpl() {
		return null;
	}

}
