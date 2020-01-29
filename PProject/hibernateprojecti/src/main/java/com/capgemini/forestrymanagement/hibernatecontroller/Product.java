package com.capgemini.forestrymanagement.hibernatecontroller;

import java.util.Scanner;
import com.capgemini.forestrymanagement.hibernatebean.ProductBean;
import com.capgemini.forestrymanagement.hibernatedao.ProductDao;
import com.capgemini.forestrymanagement.hibernateexception.ForestryException;
import com.capgemini.forestrymanagement.hibernatemanager.ProductDaoManager;

public class Product {
	public static void product() throws ForestryException {
		ProductDao dao = ProductDaoManager.getProductdao();
		ProductBean bean = new ProductBean();
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("******************Product DETAILS****************");
				System.out.println("1.Add Product");
				System.out.println("2.Delete Product");
				System.out.println("3.Modify Product");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Product Id:");
					int prodId = sc.nextInt();
					Validation.idValid(prodId);
					bean.setProductid(prodId);
					System.out.println("Enter Product Name:");
					String prodName = sc.next();
					bean.setProductName(prodName);
					System.out.println("Enter Delivery date (mm-dd-yyyy):");
					String date1 = sc.next();
					Validation.dateValid(date1);
					bean.setDeliveryDate(date1);
					System.out.println("Enter quantity:");
					int qty = sc.nextInt();
					bean.setQuantity(qty);
					boolean check = dao.addProduct(bean);
					if (check) {
						System.out.println("Product added to the list:");
					} else {
						System.out.println("Something went wrong:");
					}
					break;
				case 2:
					System.out.println("Enter the product id to delete:");
					int productid2 = sc.nextInt();
					Validation.idValid(productid2);
					boolean check2 = dao.deleteProduct(productid2);
					if (check2) {
						System.out.println("Product details deleted..");
					} else {
						System.out.println("Something went wrong!!");
					}
					break;
				case 3:
					System.out.println("Enter Product Id:");
					int prodId1 = sc.nextInt();
					Validation.idValid(prodId1);
					bean.setProductid(prodId1);
					System.out.println("Enter Product Name:");
					String prodName1 = sc.next();
					bean.setProductName(prodName1);
					System.out.println("Enter Delivery date (mm-dd-yyyy):");
					String date2 = sc.next();
					Validation.dateValid(date2);
					bean.setDeliveryDate(date2);
					System.out.println("Enter quantity:");
					int qty1 = sc.nextInt();
					bean.setQuantity(qty1);
					boolean check3 = dao.modifyProduct(bean, prodId1);
					if (check3) {
						System.out.println("Product updated to the list...");
					} else {
						System.out.println("Something went wrong !!!");
					}
					break;
				default:
					System.out.println("Invalid Entry.");
					break;
				}
			}
		} finally {
			if (sc != null)
				sc.close();
		}
	}
}// End of class
