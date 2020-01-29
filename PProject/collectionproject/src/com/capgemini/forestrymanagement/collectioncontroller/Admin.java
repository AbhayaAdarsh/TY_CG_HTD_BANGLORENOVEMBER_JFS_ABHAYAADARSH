package com.capgemini.forestrymanagement.collectioncontroller;

import java.util.Scanner;

public class Admin {
	public static void admin() {
		Scanner sc = new Scanner(System.in);
		final int ID = 101010;
		final String PASSWORD = "Admin";
		try {
			while (true) {
				System.out.println("**************WELCOME TO FORESTRY MANAGEMENT SYSTEM**************");

				System.out.println("TO LOGIN IN THIS SYSTEM PLEASE ");
				System.out.println("Enter Admin Id:");
				int aid = sc.nextInt();
				System.out.println("Enter Admin Password:");
				String password = sc.next();
				if (password.equals(PASSWORD) && aid == ID) {
					System.out.println("Authentication Successful");
					try {
						while (true) {
							System.out.println("1.CLIENT");
							System.out.println("2.CONTRACT");
							System.out.println("3.PRODUCT");
							System.out.println("4.LAND");
							int option = sc.nextInt();
							switch (option) {
							case 1:
								Client.client();
								break;
							case 2:
								Contractor.contractor();
								break;
							case 3:
								Product.product();
								break;
							case 4:
								Land.land();
								break;
							default:
								System.out.println("Invalid option.....");
								System.err.println("Only 1,2,3,4 is valid..... ");
								break;
							}
						}
					} catch (Exception e) {
						e.getMessage();
					} finally {
						try {
							if (sc != null)
								sc.close();
						} catch (Exception e2) {
							e2.getMessage();
						}
					}
				} else {
					System.err.println("Wrong Admin Name");
					System.err.println("Name should be start with Capital letter!!");
					admin();
				}
				Main.main(null);
			}
		} catch (Exception e) {
			e.getMessage();
		} finally {
			try {
				if (sc != null)
					sc.close();
			} catch (Exception e2) {
				e2.getMessage();
			}
		}
	}

}
