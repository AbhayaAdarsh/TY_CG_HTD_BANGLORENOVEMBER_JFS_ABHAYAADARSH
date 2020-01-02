package com.capge.empspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capge.empspringmvc.beans.EmployeeAddressBean;
import com.capge.empspringmvc.beans.EmployeeBean;
import com.capge.empspringmvc.dao.EmployeeDAO;

@Service // this is a service layer we prefer this otherwise we will give @Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired // in place of making object of EmployeeDao we write this
	private EmployeeDAO dao;

	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	
	@Override
	public EmployeeBean auth(String email, String password) {
		
		return dao.auth(email,password);
	}

	@Override
	public boolean register(EmployeeBean bean) {//for encoding password
		
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		
		List<EmployeeAddressBean> addressBean = bean.getAddressBeans();
		for (EmployeeAddressBean employeeAddressBean : addressBean) {
			employeeAddressBean.setBean(bean);
		}
		return dao.register(bean);
	}

	@Override
	public List<EmployeeBean> getEmployees(String key) {
		return dao.getEmployees(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id,encoder.encode(password));//hashing part
	}

}
