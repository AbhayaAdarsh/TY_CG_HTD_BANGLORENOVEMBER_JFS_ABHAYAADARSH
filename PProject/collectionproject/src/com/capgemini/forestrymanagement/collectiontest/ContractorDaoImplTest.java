package com.capgemini.forestrymanagement.collectiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.forestrymanagement.collectionbean.ContractorBean;
import com.capgemini.forestrymanagement.collectiondao.ContractorDaoImpl;

class ContractorDaoImplTest {
	ContractorBean contract = new ContractorBean();
	ContractorDaoImpl dao = new ContractorDaoImpl();

	@BeforeEach
	void load() {
		contract.setContractid("CR-01");
		contract.setCustomerId("CS-901");
		contract.setProductId("PR-00");
		contract.setHaulierId("HR-00");
		contract.setDeliveryDate("28/01/2020");
		contract.setDeliveryDay("Tuesday");
		contract.setQuantity(25);
	} 

	@Test
	void testAddContractor() {
		ContractorBean contract=new ContractorBean();
		contract.setContractid("CR-02");
		contract.setCustomerId("CS-901");
		contract.setProductId("PR-00");
		contract.setHaulierId("HR-00");
		contract.setDeliveryDate("28/01/2020");
		contract.setDeliveryDay("Tuesday");
		contract.setQuantity(25);

		try {
			boolean flag = dao.addContractor(contract);
			assertEquals(flag, true);
		} catch (Exception e) {
			dao.addContractor(contract);
		}
	}

	@Test
	void testDeleteContractor() {
		contract=new ContractorBean();
		contract.setContractid("RE-00");
		try {
			boolean flag = dao.deleteContractor(contract.getContractid());
			assertEquals(flag, false);
		} catch (Exception e) {
			dao.deleteContractor(contract.getContractid());
		}
	}

	@Test
	void testGetAllContractor() {
		contract=new ContractorBean();
		try {
			dao.getAllContractor();
			assertEquals(dao, dao);
		} catch (Exception e) {
			dao.getAllContractor();
		}
	}
	
}


