package com.capgemini.retailermaintenancesystemapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.retailermaintenancesystemapplication.dao.OrderInfoDao;
import com.capgemini.retailermaintenancesystemapplication.dto.OrderInfoBean;
import com.capgemini.retailermaintenancesystemapplication.exception.OrderInfoException;

public class OrderInfoServiceImpl implements OrderInfoService{

	@Autowired
	private OrderInfoDao dao;
		
	@Override
	public boolean addOrderInfoProfile(OrderInfoBean bean) {
		return dao.addOrderInfoProfile(bean);
	}

	@Override
	public OrderInfoBean getOrderInfo(int id) {
		return dao.getOrderInfo(id);
	}

	@Override
	public List<OrderInfoBean> getAllOrder(int id) throws OrderInfoException {
		return dao.getAllOrder(id);
	}

	@Override
	public boolean getAllOrder(OrderInfoBean bean) {
		return false;
	}

	@Override
	public boolean updateOrder(int id, OrderInfoBean bean1) {
		return false;
	}

	@Override
	public List<OrderInfoBean> getAllOrder() {
		return null;
	}

}
