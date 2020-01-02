package com.capgemini.empspringboot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.empspringboot.dto.EmployeeBean;

public interface EmployeeRepository extends JpaRepository<EmployeeBean, Integer> {
	
	public EmployeeBean findByEmail(String email);
	
	@Query("from EmployeeBean where name=:key or email=:key") //here we define our own query so that it is not showing error
	public List<EmployeeBean> findByKey(@Param("key") String key);

	@Transactional
	@Modifying //by using this it automatically modify the password
	@Query("update EmployeeBean set password=:password where id=:id")//here password or param password name and spelling should be same
	public void changePassword(@Param("id") int id,@Param("password") String password);
}
