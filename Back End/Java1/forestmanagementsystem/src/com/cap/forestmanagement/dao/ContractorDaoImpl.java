package com.cap.forestmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import com.cap.forestmanagement.bean.ContractorBean;

public class ContractorDaoImpl implements ContractorDao {

	private List<ContractorBean> contractorBean=new ArrayList<ContractorBean>();

	@Override
	public boolean addContract(ContractorBean bean) {
		for (ContractorBean contractorBean : contractorBean) {
			if(contractorBean.getContractid()==bean.getContractid())
			{
				return false;
			}
		}
		contractorBean.add(bean);
		return true;
	
	}
	
	@Override
	public boolean deleteContract(int contractorid) {
		ContractorBean bean=null;
		for (ContractorBean contractorBean2 : contractorBean) {
			if(contractorBean2.getContractid()== contractorid)
			{
				bean=contractorBean2;	
			}
		}
		if(bean!=null) {
			contractorBean.remove(bean);
			return true;
		}
		return false;
	}
	

	@Override
	public boolean modifyContract(ContractorBean bean) {
		for (ContractorBean contractorBean2 : contractorBean) {
			if(contractorBean2.getContractid()== bean.getContractid())
			{
				contractorBean.remove(bean);
				return true;	
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "ContractorDaoImpl [contractorBean=" + contractorBean + "]";
	}

	@Override
	public List<ContractorBean> getAllContract() {
		
		return null;
	}

}
