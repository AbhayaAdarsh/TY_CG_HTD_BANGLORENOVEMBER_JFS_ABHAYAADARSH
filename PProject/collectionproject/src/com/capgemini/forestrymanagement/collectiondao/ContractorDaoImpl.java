package com.capgemini.forestrymanagement.collectiondao;

import java.util.ArrayList;
import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.ContractorBean;

public class ContractorDaoImpl implements ContractorDao {
	private List<ContractorBean> contractorBean = new ArrayList<ContractorBean>();

	@Override
	public boolean addContractor(ContractorBean bean) {
		for (ContractorBean contractorBean : contractorBean) {
			if (contractorBean.getContractid() == bean.getContractid()) {
				return false;
			}
		}
		contractorBean.add(bean);
		return true;
	}

	@Override
	public boolean deleteContractor(int contractorid) {
		ContractorBean bean = null;
		for (ContractorBean contractorBean2 : contractorBean) {
			if (contractorBean2.getContractid() == contractorid) {
				bean = contractorBean2;
			}
		}
		if (bean != null) {
			contractorBean.remove(bean);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyContractor(ContractorBean bean) {
		for (ContractorBean contractorBean2 : contractorBean) {
			if (contractorBean2.getContractid() == bean.getContractid()) {
				contractorBean.contains(contractorBean2);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean displayContractor(int contractorid) {
		return false;
	}

	@Override
	public List<ContractorBean> getAllContractor() {
		return null;
	}

}
