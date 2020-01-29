package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbccontroller;

import java.util.Scanner;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.LandBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.LandDaoManager;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.LandServices;

public class Land {
	public static void land() {
		LandServices services = LandDaoManager.instanceOfLandServiceImpl();
		LandBean bean = new LandBean();
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("**************Land DETAILS************");
				System.out.println("1.Add Land");
				System.out.println("2.Delete Land");
				System.out.println("3.Modify Land");
				System.out.println("Enter your choice:");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Land No:");
					int landNo = sc.nextInt();
					Validation.idValid(landNo);
					bean.setLandNo(landNo);
					System.out.println("Enter Land Lord Name:");
					String landlordName = sc.next();
					if (!Validation.nameValid(landlordName)) {
						System.err.println("Invalid Name Format");
						land();
					}
					bean.setLandlordName(landlordName);
					System.out.println("Enter Land Deatils:");
					String landDetails = sc.next();
					bean.setLandDetails(landDetails);
					System.out.println("Enter Tenant Deatils:");
					String tenantDetails = sc.next();
					bean.setTenantDetails(tenantDetails);
					boolean check = services.addLand(bean);
					if (check) {
						System.out.println("Land added to the list:");
					} else {
						System.out.println("Something went wrong:");
					}
					break;
				case 2:
					System.out.println("Enter the Land id to delete:");
					int LandId1 = sc.nextInt();
					boolean check2 = services.deleteLand(LandId1);
					if (check2) {
						System.out.println("Land details deleted..");
					} else {
						System.out.println("Something went wrong!!");
					}
					break;
				case 3:
					System.out.println("Enter Land No:");
					int landNo1 = sc.nextInt();
					Validation.idValid(landNo1);
					bean.setLandNo(landNo1);
					System.out.println("Enter Land Lord Name:");
					String landlordName1 = sc.next();
					if (!Validation.nameValid(landlordName1)) {
						System.err.println("Invalid Name Format");
						land();
					}
					bean.setLandlordName(landlordName1);
					System.out.println("Enter Land Deatils:");
					String landDetails1 = sc.next();
					bean.setLandDetails(landDetails1);
					System.out.println("Enter Tenant Deatils:");
					String tenantDetails1 = sc.next();
					bean.setTenantDetails(tenantDetails1);
					boolean check3 = services.modifyLand(bean);
					if (check3) {
						System.out.println("Land updated to the list...");
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
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
}// End of class
