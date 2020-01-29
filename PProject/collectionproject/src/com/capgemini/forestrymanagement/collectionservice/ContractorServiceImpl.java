package com.capgemini.forestrymanagement.collectionservice;

import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.ContractorBean;
import com.capgemini.forestrymanagement.collectiondao.ContractorDao;
import com.capgemini.forestrymanagement.collectionmanager.ContractorDaoManager;

public class ContractorServiceImpl implements ContractorServices {
	ContractorDao dao = ContractorDaoManager.instanceOfContractorDaoImpl();

	@Override
	public boolean addContractor1(ContractorBean bean) {
		return dao.addContractor(bean);
	}

	@Override
	public boolean deleteContractor(int contractid) {
		return dao.deleteContractor(contractid);
	}

	@Override
	public boolean modifyContractor1(ContractorBean bean) {
		return dao.modifyContractor(bean);
	}

	@Override
	public ContractorBean getContractor1(int contractid) {
		return null;
	}

	@Override
	public List<ContractorBean> getAllContractor() {
		return dao.getAllContractor();
	}

	@Override
	public boolean addContractor(ContractorBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyContractor(ContractorBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ContractorBean getContractor(int contractid) {
		// TODO Auto-generated method stub
		return null;
	}

}
