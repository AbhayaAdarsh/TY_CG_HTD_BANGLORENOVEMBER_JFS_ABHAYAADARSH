package com.capgemini.springrestforestrymanagement.services;

import java.util.List;

import com.capgemini.springrestforestrymanagement.dto.ContractorBean;

public interface ContractorServices {
	public List<ContractorBean> getAllContarctor();
	public boolean updateContarctor(int cid,ContractorBean contarctorToUpdate);
	public boolean deletecontarctor(int cid);
	//create contarctorBean obje and pass to insert all values
	public boolean addContarctor(ContractorBean contractor);
	public ContractorBean searchContarctor(int cid);

}
