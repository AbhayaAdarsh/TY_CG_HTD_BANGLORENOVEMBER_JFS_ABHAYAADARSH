package com.capgemini.forestrymanagement.springbootcontroller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import com.capgemini.forestrymanagement.springbootdto.LandResponce;
import com.capgemini.forestrymanagement.springbootexception.LandException;

public class LandControllerAdvice {
	@ExceptionHandler(LandException.class)
	public LandResponce handleLandException(LandException e) {
		LandResponce landResponce = new LandResponce();
		landResponce.setStatusCode(501);
		landResponce.setMessage("Exception");
		landResponce.setDescription(e.getMessage());
		return landResponce;
	}
}
