package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbccontroller;

import java.util.Scanner;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ProductBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcexception.ForestryException;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.ProductDaoManager;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.ProductServices;

public class Product {
	public static void product() throws ForestryException {
		ProductServices services = ProductDaoManager.instanceOfProductServiceImpl();
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
					int productId = sc.nextInt();
					Validation.idValid(productId);
					bean.setProductId(productId);
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
					boolean check = services.addProduct(bean);
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
					boolean check2 = services.deleteProduct(productid2);
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
					bean.setProductId(prodId1);
					System.out.println("Enter Product Name:");
					String prodName1 = sc.next();
					bean.setProductName(prodName1);
					System.out.println("Enter Delivery date (mm-dd-yyyy):");
					String date2 = sc.next();
					Validation.dateValid(date2);
					bean.setDeliveryDate(date2);
					System.out.println("Enter delivery day:");
					String dlvryDay1 = sc.next();
					bean.setDeliveryDay(dlvryDay1);
					System.out.println("Enter quantity:");
					int qty1 = sc.nextInt();
					bean.setQuantity(qty1);
					boolean check3 = services.modifyProduct(bean);
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
