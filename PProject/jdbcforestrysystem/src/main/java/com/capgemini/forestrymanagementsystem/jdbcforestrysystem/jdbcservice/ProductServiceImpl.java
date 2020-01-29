package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ProductBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.ProductDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.ProductDaoManager;

public class ProductServiceImpl implements ProductServices {
	ProductDao dao = ProductDaoManager.instanceOfProductDaoImpl();

	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		return dao.modifyProduct(bean);
	}

	@Override
	public boolean deleteProduct(int productid) {
		return dao.deleteProduct(productid);
	}
}
