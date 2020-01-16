package com.capgemini.retailermaintenancesystemapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenancesystemapplication.dao.ProductInfoDao;
import com.capgemini.retailermaintenancesystemapplication.dto.ProductInfoBean;
import com.capgemini.retailermaintenancesystemapplication.exception.ProductInfoException;


@Service
public class ProductInfoServiceImpl implements ProductInfoService{
	
		@Autowired
		private ProductInfoDao dao;
		
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		
		@Override
		public boolean addProductInfoProfile(ProductInfoBean bean) {
			return dao.addProductInfoProfile(bean);
		}

		@Override
		public ProductInfoBean getProductInfo(int id) {
			return dao.getProductInfo(id);
		}

		@Override
		public boolean updatePassword(int id, String password) {
			return dao.updatePassword(id,encoder.encode(password));
		}

		@Override
		public List<ProductInfoBean> getAllProduct(int id) throws ProductInfoException {
			return dao.getAllProduct(id);
		}

		@Override
		public boolean getAllProduct(ProductInfoBean bean) {
			return false;
		}

		@Override
		public boolean updateProduct(int id, ProductInfoBean bean1) {
			return false;
		}

		@Override
		public List<ProductInfoBean> getAllProduct() {
			return null;
		}


		
}	
		
		
		
		
		
		


		