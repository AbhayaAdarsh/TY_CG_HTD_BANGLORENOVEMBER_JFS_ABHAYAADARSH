package com.capgemini.productspringboot.controller;

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

import com.capgemini.productspringboot.dto.ProductBean;
import com.capgemini.productspringboot.dto.ProductResponse;
import com.capgemini.productspringboot.exception.ProductException;
import com.capgemini.productspringboot.service.ProductService;

@RestController
public class ProductController {

		@Autowired
		private ProductService service;
		
		@PostMapping(path = "/register" , produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
		public ProductResponse addProduct(@RequestBody ProductBean bean) {
			ProductResponse responce=new ProductResponse();
			
			if(service.addProduct(bean)) {
				responce.setStatusCode(201);
				responce.setMessage("Success");
				responce.setDiscription("Product Registered.");
			}else {
				responce.setStatusCode(401);
				responce.setMessage("Failure");
				responce.setDiscription("Product already exsist");
			}
			
			return responce;
		}
		
		
		@GetMapping(path = "/get",produces=MediaType.APPLICATION_JSON_VALUE)//here we dont use consumes in getmapping
		public ProductResponse getProduct(@RequestParam("id") int id) {
			ProductResponse responce=new ProductResponse();
			ProductBean beans=service.getProduct(id);
			if(beans==null) {
				responce.setStatusCode(201);
				responce.setMessage("Success");
				responce.setDiscription("Product Search Successful");
				
			}else {
				responce.setStatusCode(401);
				responce.setMessage("Failure");
				responce.setDiscription("Data not Found!!! ");
			}
			return  responce;
		}
		
		@GetMapping(path = "/getAll",produces=MediaType.APPLICATION_JSON_VALUE)//here we dont use consumes in getmapping
		public ProductResponse getAllProduct() {
			ProductResponse responce=new ProductResponse();
			List<ProductBean> beans=service.getAllProduct();
			if(beans==null) {
				responce.setStatusCode(201);
				responce.setMessage("Success");
				responce.setDiscription("All Product Found.");
				
			}else {
				responce.setStatusCode(401);
				responce.setMessage("Failure");
				responce.setDiscription("Data not Found!!! ");
			}
			return  responce;
		}
		
		@PutMapping(path = "/change",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
		public ProductResponse updateProduct(@RequestBody ProductBean bean) {
			ProductResponse responce=new ProductResponse();
			ProductBean bean1=new ProductBean();
			bean1.setCost(bean.getCost());
			bean1.setImageUrl(bean.getImageUrl());
			bean1.setName(bean.getName());
			
			if(service.updateProduct(bean.getId(),bean1)) {
				responce.setStatusCode(201);
				responce.setMessage("Success");
				responce.setDiscription("Product Updated Successfully....");
				
			}else {
				responce.setStatusCode(401);
				responce.setMessage("Failure");
				responce.setDiscription("Unable to change name.");
			}
			return responce;
		}
		
		@DeleteMapping(path="/delete/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
		public ProductResponse deleteEmployee(@PathVariable("id") int id) throws ProductException{
			ProductResponse responce=new ProductResponse();
			service.deleteProduct(id);
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDiscription("Product Details Deleted");
			return responce;
		}

}
