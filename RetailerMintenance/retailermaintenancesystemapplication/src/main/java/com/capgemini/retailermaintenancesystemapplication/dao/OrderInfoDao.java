package com.capgemini.retailermaintenancesystemapplication.dao;

import java.util.List;

import com.capgemini.retailermaintenancesystemapplication.dto.OrderInfoBean;

public interface OrderInfoDao {

	boolean addOrderInfoProfile(OrderInfoBean bean);

	OrderInfoBean getOrderInfo(int id);

	List<OrderInfoBean> getAllOrder(int id);

}
