package com.capgemini.forestrymanagement.collectionservice;

import com.capgemini.forestrymanagement.collectionbean.ProductBean;
import com.capgemini.forestrymanagement.collectiondao.ProductDao;
import com.capgemini.forestrymanagement.collectionmanager.ProductDaoManager;

public class ProductServiceImpl implements ProductServices {
	ProductDao dao = ProductDaoManager.instanceOfProductDaoImpl();

	@Override
	public boolean addProduct1(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean modifyProduct1(ProductBean bean) {
		return dao.modifyProduct(bean);
	}

	@Override
	public boolean deleteProduct(int productid) {
		return dao.deleteProduct(productid);
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

}
