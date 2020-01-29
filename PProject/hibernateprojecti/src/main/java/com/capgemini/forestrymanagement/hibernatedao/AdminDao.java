package com.capgemini.forestrymanagement.hibernatedao;

import com.capgemini.forestrymanagement.hibernatebean.AdminBean;

public interface AdminDao {

	public AdminBean login(int adminId , String password);

	boolean register(AdminBean bean);
}
