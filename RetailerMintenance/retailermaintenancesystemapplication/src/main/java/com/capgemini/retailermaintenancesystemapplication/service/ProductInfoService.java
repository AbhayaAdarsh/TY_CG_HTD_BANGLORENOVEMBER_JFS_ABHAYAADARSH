package com.capgemini.retailermaintenancesystemapplication.service;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplication.dto.ProductInfoBean;
import com.capgemini.retailermaintenancesystemapplication.exception.ProductInfoException;

public interface ProductInfoService {

public boolean addProductInfoProfile(ProductInfoBean bean);
public ProductInfoBean getProductInfo(int id);
public boolean updatePassword(int id,String password);
List<ProductInfoBean> getAllProduct(int id) throws ProductInfoException;
boolean getAllProduct(ProductInfoBean bean);
public boolean updateProduct(int id, ProductInfoBean bean1);
public List<ProductInfoBean> getAllProduct();

}
