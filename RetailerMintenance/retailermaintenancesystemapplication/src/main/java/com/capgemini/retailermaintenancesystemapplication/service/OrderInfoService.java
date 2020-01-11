package com.capgemini.retailermaintenancesystemapplication.service;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplication.dto.OrderInfoBean;
import com.capgemini.retailermaintenancesystemapplication.exception.OrderInfoException;

public interface OrderInfoService {
	public boolean addOrderInfoProfile(OrderInfoBean bean);
	public OrderInfoBean getOrderInfo(int id);
	List<OrderInfoBean> getAllOrder(int id) throws OrderInfoException;
	boolean getAllOrder(OrderInfoBean bean);
	public boolean updateOrder(int id, OrderInfoBean bean1);
	public List<OrderInfoBean> getAllOrder();

}
