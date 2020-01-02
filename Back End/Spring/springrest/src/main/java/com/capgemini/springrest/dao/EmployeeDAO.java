package com.capgemini.springrest.dao;

import java.util.List;

import com.capgemini.springrest.dto.EmployeeBean;

public interface EmployeeDAO {
	public EmployeeBean auth(String email,String password);
	public boolean register(EmployeeBean bean);
	//public EmployeeBean getEmployee(String email);
	public List<EmployeeBean> getEmployees(String key);//in place of name write key
	public boolean changePassword(int id,String password);
	public boolean deleteEmployee(int id);
}
