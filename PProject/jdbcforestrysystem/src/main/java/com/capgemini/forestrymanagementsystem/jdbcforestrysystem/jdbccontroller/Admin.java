package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbccontroller;

import java.util.Scanner;

public class Admin {
	public static void admin() {
		Scanner sc = new Scanner(System.in);
		try {
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
				break;
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
}
