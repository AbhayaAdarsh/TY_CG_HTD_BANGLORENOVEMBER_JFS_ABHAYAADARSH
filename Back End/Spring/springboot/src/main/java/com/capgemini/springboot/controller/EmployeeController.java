package com.capgemini.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboot.dto.EmployeeBean;
import com.capgemini.springboot.dto.EmployeeResponce;
import com.capgemini.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping(path = "/auth" , produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce auth(@RequestBody EmployeeBean bean) {
		EmployeeBean employeeBean= service.auth(bean.getEmail(),bean.getPassword());
		EmployeeResponce responce=new EmployeeResponce();
		if(employeeBean!=null) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDiscription("Employee found for the credentials");
			responce.setBeans(Arrays.asList(employeeBean));
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDiscription("Credentials Invalid");
		}
		
		return responce;
	}
	
	@PostMapping(path = "/register", produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce register(@RequestBody EmployeeBean bean) {
		System.out.println(bean.getPassword());
		EmployeeResponce responce=new EmployeeResponce();
		if(service.register(bean)) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDiscription("Employee Registered");
			
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDiscription("Email already exist");
		}
		return responce;
	}
	
	@GetMapping(path = "/get",produces=MediaType.APPLICATION_JSON_VALUE)//here we dont use consumes in getmapping
	public EmployeeResponce searchEmployee(@RequestParam("key") String key) {
		EmployeeResponce responce=new EmployeeResponce();
		List<EmployeeBean> beans=service.getEmployees(key);
		if(beans.isEmpty()) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDiscription("Employee Search Successful");
			
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDiscription("Data not Found!!! ");
		}
		return  responce;
	}
	
	@PutMapping(path = "/change-password",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce changePassword(@RequestBody EmployeeBean bean) {
		EmployeeResponce responce=new EmployeeResponce();
		if( service.changePassword(bean.getId(),bean.getPassword())) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDiscription("Password Updated....");
			
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDiscription("Password not Changed...");
		}
		return responce;
	}
	
	@DeleteMapping(path="/delete/{id}")
	public EmployeeResponce deleteEmployee(@PathVariable("id") int id) {
		EmployeeResponce responce=new EmployeeResponce();
		service.deleteEmployee(id);
		responce.setStatusCode(201);
		responce.setMessage("Success");
		responce.setDiscription("Employee Details Deleted");
		return responce;
	}
}
