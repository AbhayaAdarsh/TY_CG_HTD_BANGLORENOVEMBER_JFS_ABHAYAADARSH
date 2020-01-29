package com.capgemini.forestrymanagement.collectionservice;

import java.util.List;

import com.capgemini.forestrymanagement.collectionbean.ContractorBean;

public interface ContractorServices {
	boolean addContractor(ContractorBean bean);

	boolean deleteContractor(int contractid);

	boolean modifyContractor(ContractorBean bean);

	ContractorBean getContractor(int contractid);

	List<ContractorBean> getAllContractor();

	boolean addContractor1(ContractorBean bean);
	boolean modifyContractor1(ContractorBean bean);
	ContractorBean getContractor1(int contractid);
}
