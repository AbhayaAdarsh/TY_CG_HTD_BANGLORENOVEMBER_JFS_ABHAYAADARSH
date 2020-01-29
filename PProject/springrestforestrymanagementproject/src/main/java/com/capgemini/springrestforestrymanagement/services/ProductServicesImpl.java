package com.capgemini.springrestforestrymanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springrestforestrymanagement.dao.ProductDAO;
import com.capgemini.springrestforestrymanagement.dto.ProductBean;
import com.capgemini.springrestforestrymanagement.exceptions.ValidationException;
import com.capgemini.springrestforestrymanagement.validation.Validations;

@Service
public class ProductServicesImpl implements ProductServices {
	@Autowired
	ProductDAO productDao;

	@Override
	public List<ProductBean> getAllProduct() {
		return productDao.getAllProduct();
	}

	@Override
	public boolean deleteProduct(int pid) {
		try {
			if (Validations.numberValidation(pid)) {
				return productDao.deleteProduct(pid);
			}
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	@Override
	public boolean addProduct(ProductBean product) {
		try {
			if (Validations.numberValidation(product.getCost()) 
					&& Validations.numberValidation(product.getQantity())
					&& Validations.alphabetsValidation(product.getName())
					&& Validations.alphabetsValidation(product.getProductClass())) {
				return productDao.addProduct(product);
			}
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	@Override
	public boolean checkIsTherePID(int pid) {
		try {
			if (Validations.numberValidation(pid)) {
				return productDao.checkIsTherePID(pid);
			}
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	@Override
	public boolean updateProduct(ProductBean ProductToUpdate) {
		try {
			if (Validations.numberValidation(ProductToUpdate.getPID())&&
					Validations.numberValidation(ProductToUpdate.getCost()) 
					&& Validations.numberValidation(ProductToUpdate.getQantity())
					&& Validations.alphabetsValidation(ProductToUpdate.getName())
					&& Validations.alphabetsValidation(ProductToUpdate.getProductClass())) {
				return productDao.updateProduct(ProductToUpdate);
			}
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	@Override
	public ProductBean searchProduct(int pid) {
		try {
			if (Validations.numberValidation(pid)) {
				return productDao.searchProduct(pid);
			}
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
			return null;
		}
		return null;
	}
}