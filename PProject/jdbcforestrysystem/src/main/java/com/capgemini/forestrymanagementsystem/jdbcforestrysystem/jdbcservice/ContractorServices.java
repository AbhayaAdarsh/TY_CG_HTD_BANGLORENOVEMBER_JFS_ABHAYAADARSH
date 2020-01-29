package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import java.util.List;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ContractorBean;

public interface ContractorServices {
	boolean addContractor(ContractorBean bean);

	boolean deleteContractor(int contractid);

	boolean modifyContractor(ContractorBean bean);

	ContractorBean getContractor(int contractid);

	List<ContractorBean> getAllContractor();
}
