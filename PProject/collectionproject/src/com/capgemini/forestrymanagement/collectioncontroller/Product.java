package com.capgemini.forestrymanagement.collectioncontroller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.capgemini.forestrymanagement.collectionbean.ProductBean;
import com.capgemini.forestrymanagement.collectiondao.ProductDao;
import com.capgemini.forestrymanagement.collectionmanager.ProductDaoManager;

public class Product {
	public static void product() {
		ProductDao dao = ProductDaoManager.getProductdao();
		ProductBean bean = new ProductBean();
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("**************PRODUCT DETAILS************");
				System.out.println("1.Add Product");
				System.out.println("2.Delete Product");
				System.out.println("3.Modify Product");
				System.out.println("Enter your choice:");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter productid:");
					int productId = sc.nextInt();
					if (String.valueOf(productId).length() != 6) {
						System.out.println("Invalid ID Entered!!!\nEnter Again!!");
						productId = sc.nextInt();
					}
					bean.setProductid(productId);
					boolean check = dao.addProduct(bean);
					if (check) {
						System.out.println("Product added to the list:");
					} else {
						System.out.println("Something went wrong:");
					}
					break;
				case 2:
					System.out.println("Enter the product id to delete:");
					int productId1 = sc.nextInt();
					boolean check2 = dao.deleteProduct(productId1);
					if (check2) {
						System.out.println("Product details deleted..");
					} else {
						System.out.println("Something went wrong!!");
					}
					break;
				case 3:
					System.out.println("Enter Product Id:");
					int prodId = sc.nextInt();
					if (String.valueOf(prodId).length() != 6) {
						System.out.println("Invalid ID Entered!!!\nEnter Again!!");
						productId = sc.nextInt();
					}
					bean.setProductid(prodId);
					System.out.println("Enter Product Name:");
					String productname = sc.next();
					if (!Validation.nameValid(productname)) {
						System.err.println("Invalid Name Format");
						product();
					}
					bean.setProductName(productname);
					System.out.println("Enter deliver date:");
					String dlvryDate = sc.next();
					System.out.println("Enter quantity:");
					int qty = sc.nextInt();
					bean.setProductid(prodId);
					bean.setProductName(productname);
					bean.setDeliveryDate(dlvryDate);
					bean.setQuantity(qty);
					System.out.println("Enter date (mm-dd-yyyy):");
					String date1 = sc.nextLine();
					SimpleDateFormat format = new SimpleDateFormat("mm-dd-yyyy");
					try {
						Date date = format.parse(date1);
						String dateInput = format.format(date);
						System.out.println(dateInput);
						Date d1 = format.parse("02-02-2020");
						@SuppressWarnings("unused")
						String dateLimit = format.format(d1);
						if (date.compareTo(d1) > 0) {
							System.out.println("Date is Invalid!!!");
						} else if (date.compareTo(d1) < 0) {
							System.out.println("Date is Valid.");
						} else if (date.compareTo(d1) == 0) {
							System.out.println("Date is Invalid *Same Dates!!");
						}
						System.out.println("Your Input :" + dateInput);
						System.out.println("Limit is :" + dlvryDate);
					} catch (ParseException e) {
						e.getMessage();
					}
					boolean check3 = dao.modifyProduct(bean);
					if (check3) {
						System.out.println("Product updated to the list...");
					} else {
						System.out.println("Something went wrong !!!");
					}
					break;
				default:
					System.out.println("Invalid Entry.");
					break;

				}// End of Switch
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc != null)
					sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}// End of class
