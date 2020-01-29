package com.capgemini.forestrymanagement.springbootcontroller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import com.capgemini.forestrymanagement.springbootdto.ContractorResponce;
import com.capgemini.forestrymanagement.springbootexception.ContractorException;

public class ContractorControllerAdvice {
	@ExceptionHandler(ContractorException.class)
	public ContractorResponce handleContractorException(ContractorException e) {
		ContractorResponce contractorResponce = new ContractorResponce();
		contractorResponce.setStatusCode(501);
		contractorResponce.setMessage("Exception");
		contractorResponce.setDescription(e.getMessage());
		return contractorResponce;
	}
}
