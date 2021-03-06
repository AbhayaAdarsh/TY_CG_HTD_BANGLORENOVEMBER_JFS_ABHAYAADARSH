package com.capge.empspringmvc.service;

import java.util.List;

import com.capge.empspringmvc.beans.EmployeeBean;

public interface EmployeeService {
	public EmployeeBean auth(String email,String password);
	public boolean register(EmployeeBean bean);
	public List<EmployeeBean> getEmployees(String key);//in place of name write key
	public boolean changePassword(int id,String password);
}
