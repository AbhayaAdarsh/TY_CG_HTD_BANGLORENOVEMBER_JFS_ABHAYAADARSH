package com.capgemini.forestrymanagement.hibernatedao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestrymanagement.hibernatebean.ContractorBean;

public class ContractorDaoImpl implements ContractorDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");

	@Override
	public boolean addContractor(ContractorBean bean) {
		boolean isAdded = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction;
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return isAdded;
	}

	@Override
	public boolean deleteContractor(int contractorid) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = null;
		ContractorBean bean = manager.find(ContractorBean.class, contractorid);
		if (bean != null) {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			isDeleted = true;
		}
		manager.close();
		return isDeleted;
	}

	@Override
	public boolean modifyContractor(ContractorBean bean, int contractorid) {
		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		ContractorBean bean1 = manager.find(ContractorBean.class, contractorid);
		EntityTransaction transaction = manager.getTransaction();
		if (bean1 != null) {
			try {
				transaction.begin();
				int contractorid1 = bean.getContractorId();
				if (contractorid1 > 0) {
					bean1.setContractorId(contractorid);
				}
				int customerId = bean.getcustomerId();
				if (customerId > 0) {
					bean1.setContractorId(customerId);
				}
				int productId = bean.getproductId();
				if (productId > 0) {
					bean1.setproductId(productId);
				}
				int haulierId = bean.gethaulierId();
				if (haulierId > 0) {
					bean1.sethaulierId(haulierId);
				}
				String deliveryDate = bean.getDeliveryDate().trim();
				if (deliveryDate != null && deliveryDate.isEmpty()) {
					bean1.setDeliveryDate(deliveryDate);
				}
				int quantity = bean.getquantity();
				if (quantity > 0) {
					bean1.setquantity(quantity);
				}
				transaction.commit();
				isUpdated = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		manager.close();
		return isUpdated;
	}

	@Override
	public List<ContractorBean> getAllContractor() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ContractorBean";
		Query query = manager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<ContractorBean> list = query.getResultList();
		return list;
	}
} // class ended
