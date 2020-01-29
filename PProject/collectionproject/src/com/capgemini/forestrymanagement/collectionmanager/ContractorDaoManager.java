package com.capgemini.forestrymanagement.collectionmanager;

import com.capgemini.forestrymanagement.collectiondao.ContractorDao;
import com.capgemini.forestrymanagement.collectiondao.ContractorDaoImpl;

public class ContractorDaoManager {

	public static ContractorDao getContractordao() {
		return new ContractorDaoImpl();
	}

	public static ContractorDao instanceOfContractorDaoImpl() {
		return null;
	}

}
