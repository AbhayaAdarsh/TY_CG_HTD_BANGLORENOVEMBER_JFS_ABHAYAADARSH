package com.capgemini.retailermaintenancesystemapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintenancesystemapplication.dto.ProductInfoBean;
import com.capgemini.retailermaintenancesystemapplication.dto.ProductInfoResponce;
import com.capgemini.retailermaintenancesystemapplication.exception.ProductInfoException;
import com.capgemini.retailermaintenancesystemapplication.service.ProductInfoService;

@RestController
@CrossOrigin(origins ="*",allowedHeaders="*",allowCredentials="true")
public class ProductInfoController {

			@Autowired
			private ProductInfoService service;
			
			@PostMapping(path = "/register" , produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
			public ProductInfoResponce addProduct(@RequestBody ProductInfoBean bean) {
				ProductInfoResponce responce=new ProductInfoResponce();
				
				if(service.getAllProduct(bean)) {
					responce.setStatusCode(201);
					responce.setMessage("Success");
					responce.setDescription("Product Registered.");
				}else {
					responce.setStatusCode(401);
					responce.setMessage("Failure");
					responce.setDescription("Product already exsist");
				}
				
				return responce;
			}
			
			
			@GetMapping(path = "/get",produces=MediaType.APPLICATION_JSON_VALUE)
			public ProductInfoResponce getProduct(@RequestParam("id") int id) {
				ProductInfoResponce responce=new ProductInfoResponce();
				ProductInfoBean beans=service.getProductInfo(id);
				if(beans==null) {
					responce.setStatusCode(201);
					responce.setMessage("Success");
					responce.setDescription("Product Search Successful");
					
				}else {
					responce.setStatusCode(401);
					responce.setMessage("Failure");
					responce.setDescription("Data not Found!!! ");
				}
				return  responce;
			}
			
			@GetMapping(path = "/getAll",produces=MediaType.APPLICATION_JSON_VALUE)//here we dont use consumes in getmapping
			public ProductInfoResponce getAllProduct() {
				ProductInfoResponce responce=new ProductInfoResponce();
				List<ProductInfoBean> beans=service.getAllProduct();
				if(beans==null) {
					responce.setStatusCode(201);
					responce.setMessage("Success");
					responce.setDescription("All Product Found.");
					
				}else {
					responce.setStatusCode(401);
					responce.setMessage("Failure");
					responce.setDescription("Data not Found!!! ");
				}
				return  responce;
			}
			
			@PutMapping(path = "/change",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
			public ProductInfoResponce updateProduct(@RequestBody ProductInfoBean bean) {
				ProductInfoResponce responce=new ProductInfoResponce();
				ProductInfoBean bean1=new ProductInfoBean();
				bean1.setUserid(bean.getId());
				bean1.setPassword(bean.getPassword());
				bean1.setName(bean.getName());
				
				if(service.updateProduct(bean.getId(),bean1)) {
					responce.setStatusCode(201);
					responce.setMessage("Success");
					responce.setDescription("Product Updated Successfully....");
					
				}else {
					responce.setStatusCode(401);
					responce.setMessage("Failure");
					responce.setDescription("Unable to change name.");
				}
				return responce;
			}
			
			@DeleteMapping(path="/delete/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
			public ProductInfoResponce deleteEmployee(@PathVariable("id") int id) throws ProductInfoException{
				ProductInfoResponce responce=new ProductInfoResponce();
				service.getProductInfo(id);
				responce.setStatusCode(201);
				responce.setMessage("Success");
				responce.setDescription("Product Details Deleted");
				return responce;
			}

}