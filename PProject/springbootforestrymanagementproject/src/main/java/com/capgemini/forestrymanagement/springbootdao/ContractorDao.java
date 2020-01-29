package com.capgemini.forestrymanagement.springbootdao;

import java.util.List;
import com.capgemini.forestrymanagement.springbootdto.ContractorBean;

public interface ContractorDao {
	boolean addContractor(ContractorBean bean);

	boolean deleteContractor(int contractorid);

	boolean updateContractor(ContractorBean bean);

	public List<ContractorBean> getAllContractor();
	
	public List<ContractorBean> getContractor(int contractorid);
}
