package com.capgemini.forestrymanagement.springbootdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;
import com.capgemini.forestrymanagement.springbootdto.ProductBean;
import com.capgemini.forestrymanagement.springbootexception.ProductException;

@Repository
public class ProductDaoImpl implements ProductDao {
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean registerProduct(ProductBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			throw new ProductException("Product already exists");
		}
	}
	
	@Override
	public boolean addProduct(ProductBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ProductBean productInfoBean = new ProductBean();
		productInfoBean.setProductId(bean.getProductId());
		productInfoBean.setProductName(bean.getProductName());
		productInfoBean.setQuantity(bean.getQuantity());
		productInfoBean.setDeliveryDate(bean.getDeliveryDate());
		transaction.begin();
		try {
			manager.persist(productInfoBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new ProductException("Product already exists");
		}
	}

	@Override
	public boolean updateProduct( ProductBean bean) {
		EntityManager managers = factory.createEntityManager();
		EntityTransaction transaction = managers.getTransaction();
		transaction.begin();
		try {
		ProductBean beans= managers.find(ProductBean.class,bean.getProductId());
		beans.setProductName(bean.getProductName());
		transaction.commit();
		return true;
	    } catch (Exception e) {
			throw new ProductException("Product already Updated");
		}
	}

	@Override
	public boolean deleteProduct(int productId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		ProductBean bean = manager.find(ProductBean.class, productId);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		  }
		return false;
	} catch (Exception e) {
		throw new ProductException("Product not deleted");
	}
  }
}
