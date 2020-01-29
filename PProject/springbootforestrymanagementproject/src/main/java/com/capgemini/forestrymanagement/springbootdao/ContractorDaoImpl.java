
package com.capgemini.forestrymanagement.springbootdao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;
import com.capgemini.forestrymanagement.springbootdto.ContractorBean;
import com.capgemini.forestrymanagement.springbootdto.CustomerBean;
import com.capgemini.forestrymanagement.springbootexception.ContractorException;
import com.capgemini.forestrymanagement.springbootexception.CustomerException;

@Repository
public class ContractorDaoImpl implements ContractorDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addContractor(ContractorBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ContractorBean contractorBean = new ContractorBean();
		contractorBean.setContractorId(bean.getContractorId());
		contractorBean.setContractorName(bean.getContractorName());
		contractorBean.setContractorPassword(bean.getContractorPassword());
		transaction.begin();
		try {
			manager.persist(contractorBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new ContractorException("Contractor already exists");
		}
	}

	@Override
	public boolean deleteContractor(int contractorid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		CustomerBean bean = manager.find(CustomerBean.class, contractorid);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
		} catch (Exception e) {
			throw new CustomerException("Customer already exists");
		}
	}

	@Override
	public boolean updateContractor(ContractorBean bean) {
		return false;
	}

	@Override
	public List<ContractorBean> getContractor(int contractorid) {
		return null;
	}

	@Override
	public List<ContractorBean> getAllContractor() {
		return null;
	}
}
