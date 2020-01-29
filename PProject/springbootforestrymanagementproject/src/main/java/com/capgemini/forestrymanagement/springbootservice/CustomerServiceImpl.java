package com.capgemini.forestrymanagement.springbootservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.forestrymanagement.springbootdao.CustomerDao;
import com.capgemini.forestrymanagement.springbootdto.CustomerBean;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao dao;
	@Override
	public boolean addCustomer(CustomerBean bean) {
		return dao.addCustomer(bean);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		return dao.deleteCustomer(customerId);
	}

	@Override
	public CustomerBean getCustomer(int customerId) {
		return dao.getCustomer(customerId);
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		return dao.getAllCustomer();
	}

	@Override
	public boolean updateCustomer(CustomerBean bean) {
		return false;
	}

	@Override
	public boolean registerCustomer(CustomerBean bean) {
		return false;
	}

}
