package com.capgemini.forestrymanagement.springbootdao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.capgemini.forestrymanagement.springbootdto.ClientBean;
import com.capgemini.forestrymanagement.springbootexception.AdminException;
import com.capgemini.forestrymanagement.springbootexception.ClientException;

@Repository
public class ClientDaoImpl implements ClientDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addClient(ClientBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ClientBean clientBean = new ClientBean();
		clientBean.setClientId(bean.getClientId());
		clientBean.setClientName(bean.getClientName());
		clientBean.setClientPassword(bean.getClientPassword());
		transaction.begin();
		try {
			manager.persist(clientBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new ClientException("client already exists");
		}
	}

	@Override
	public boolean deleteClient(int clientid) {
		try {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ClientBean bean = manager.find(ClientBean.class, clientid);
		if (bean != null) {
			transaction.begin();
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	  } catch (Exception e) {
			throw new ClientException("client already exists");
		}
	}

	@Override
	public boolean updateClient(int clientid, ClientBean bean) {
		
		EntityManager manager1 = factory.createEntityManager();
		EntityTransaction transaction = manager1.getTransaction();
		transaction.begin();
		try {
		ClientBean bean1 = manager1.find(ClientBean.class, clientid);
		bean1.setClientName(bean1.getClientName());
		transaction.commit();
		return true;
		}catch (Exception e) {
			throw new ClientException("client already exists");
		}
	}

	@Override
	public ClientBean getClient(int clientid) {
		String jpql = "from ClientBean where clientid=:clientid";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ClientBean> query = manager.createQuery(jpql, ClientBean.class);
		query.setParameter("clientid", clientid);
		try {
			return query.getSingleResult();
		} catch (Exception e) {
			throw new AdminException("Client not found");
		}
	}

	@Override
	public List<ClientBean> getAllClient() {
		try {
		String jpql = "from ClientBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ClientBean> query = manager.createQuery(jpql, ClientBean.class);
		return query.getResultList();
	    }catch (Exception e) {
			throw new AdminException("Client not found");
		}
	}	
}
