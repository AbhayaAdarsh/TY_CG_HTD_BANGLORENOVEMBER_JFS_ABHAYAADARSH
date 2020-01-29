package com.capgemini.forestrymanagement.collectiondao;

import java.util.List;

import com.capgemini.forestrymanagement.collectionbean.ContractorBean;

public interface ContractorDao {
	public boolean addContractor(ContractorBean bean);

	public boolean deleteContractor(int contractorid);

	public boolean modifyContractor(ContractorBean bean);

	public boolean displayContractor(int contractorid);

	public List<ContractorBean> getAllContractor();
}
