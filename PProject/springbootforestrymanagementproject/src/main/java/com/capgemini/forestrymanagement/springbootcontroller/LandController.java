package com.capgemini.forestrymanagement.springbootcontroller;

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
import com.capgemini.forestrymanagement.springbootdto.LandBean;
import com.capgemini.forestrymanagement.springbootdto.LandResponce;
import com.capgemini.forestrymanagement.springbootexception.LandException;
import com.capgemini.forestrymanagement.springbootservice.LandServices;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class LandController {
	@Autowired
	private LandServices service;

	@PostMapping(path = "/registerLand", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LandResponce addLand(@RequestBody LandBean bean) {
		LandResponce responce = new LandResponce();
		if (service.registerLand(bean)) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Land Registered.");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Land already exsist");
		}
		return responce;
	}
	
	@GetMapping(path = "/getLand", produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponce getLand(@RequestParam("landno") int landno) {
		LandResponce responce = new LandResponce();
		List<LandBean> beans = service.getLandBean(landno);
		if (beans.isEmpty()) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Employearch Successful");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Data not Found!!! ");
		}
		return responce;
	}

	@GetMapping(path = "/getAllLand", produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponce getAllLand() {
		LandResponce responce = new LandResponce();
		List<LandBean> beans = service.getAllLand();
		if (beans == null) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("All LandLand Found.");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Data not Found!!! ");
		}
		return responce;
	}

	@PutMapping(path = "/updateLand", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LandResponce updateLand(@RequestBody LandBean bean) {
		LandResponce responce = new LandResponce();
		LandBean beans = new LandBean();
		beans.setLandNo(bean.getLandNo());
		beans.setLandPrice(bean.getLandPrice());
		beans.setLandOwner(bean.getLandOwner());
		beans.setLandPrice(bean.getLandPrice());
		if (service.updateLand(bean)) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Land Updated Successfully....");
		} else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Unable to change number.");
		}
		return responce;
	}
	
	@DeleteMapping(path = "/deleteLand", produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponce deleteEmployee(@PathVariable("landno") int landno) throws LandException {
		LandResponce responce = new LandResponce();
		service.deleteLand(landno);
		responce.setStatusCode(201);
		responce.setMessage("Success");
		responce.setDescription("Land Details Deleted");
		return responce;
	}

}
