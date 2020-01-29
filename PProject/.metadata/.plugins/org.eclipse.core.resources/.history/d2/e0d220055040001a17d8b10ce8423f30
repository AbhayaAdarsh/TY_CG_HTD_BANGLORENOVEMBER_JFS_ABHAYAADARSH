package com.capgemini.forestrymanagement.hibernatedao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.capgemini.forestrymanagement.hibernatebean.ContractorBean;

class ContractorDaoImplTest {
	ContractorBean contractorBean = null;
    ContractorDaoImpl contractorDao = null;
    @BeforeEach
    void loadDriver() {
   contractorDao = new ContractorDaoImpl();
    }
	@Test
	void testAddContractor() {
		contractorBean = new ContractorBean();
		contractorBean.setContractorId(67);
		contractorBean.setquantity(21);
		boolean check = contractorDao.addContractor(contractorBean);
		assertTrue(check);
	}

	@Test
	void testDeleteContractor() {
		int contractorId =67;
	    boolean check = contractorDao.deleteContractor(contractorId);
	    assertEquals(check,true);  
	}
	
	@Test
	void testGetAllContractor() {
		List<ContractorBean> check = contractorDao.getAllContractor();
		assertEquals(check!=null,true);
	}

}
