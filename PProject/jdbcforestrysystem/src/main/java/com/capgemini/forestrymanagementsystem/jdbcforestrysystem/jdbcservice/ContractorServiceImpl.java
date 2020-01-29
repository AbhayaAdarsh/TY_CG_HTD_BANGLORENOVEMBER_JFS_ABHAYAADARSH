package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import java.util.List;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ContractorBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.ContractorDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.ContractorDaoManager;

public class ContractorServiceImpl implements ContractorServices {
	ContractorDao dao = ContractorDaoManager.instanceOfContractorDaoImpl();

	@Override
	public boolean addContractor(ContractorBean bean) {
		return dao.addContractor(bean);
	}

	@Override
	public boolean deleteContractor(int contractid) {
		return dao.deleteContractor(contractid);
	}

	@Override
	public boolean modifyContractor(ContractorBean bean) {
		return dao.modifyContractor(bean);
	}

	@Override
	public ContractorBean getContractor(int contractid) {
		return null;
	}

	@Override
	public List<ContractorBean> getAllContractor() {
		return dao.getAllContractor();
	}
}
