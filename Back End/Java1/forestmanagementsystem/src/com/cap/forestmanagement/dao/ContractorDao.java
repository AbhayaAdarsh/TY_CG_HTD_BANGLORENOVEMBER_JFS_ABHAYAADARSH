package com.cap.forestmanagement.dao;

import java.util.List;

import com.cap.forestmanagement.bean.ContractorBean;

public interface ContractorDao 
{

	boolean addContract(ContractorBean bean);
	
	boolean deleteContract(int contractorid);
	
	boolean modifyContract(ContractorBean bean);

	List<ContractorBean> getAllContract();
	
}
