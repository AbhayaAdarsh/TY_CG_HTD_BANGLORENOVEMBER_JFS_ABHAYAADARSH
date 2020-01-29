package com.capgemini.forestrymanagement.hibernatecontroller;

import java.util.Scanner;
import com.capgemini.forestrymanagement.hibernatebean.SchedularBean;
import com.capgemini.forestrymanagement.hibernatedao.SchedularDao;
import com.capgemini.forestrymanagement.hibernateexception.ForestryException;
import com.capgemini.forestrymanagement.hibernatemanager.SchedularDaoManager;

public class Schedular {
	public static void schedular() {
		SchedularDao dao = SchedularDaoManager.getSchedulardao();
		SchedularBean bean = new SchedularBean();
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("**************SCHEDULAR DETAILS************");
				System.out.println("1.Add Schedular");
				System.out.println("2.Delete Schedular");
				System.out.println("3.Modify Schedular");
				System.out.println("Enter your choice:");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Schedular Id:");
					int schedularId = sc.nextInt();
					Validation.idValid(schedularId);
					bean.setschedulerId(schedularId);
					System.out.println("Enter Schedular Name:");
					String schedularname1 = sc.next();
					if (!Validation.nameValid(schedularname1)) {
						throw new ForestryException("Invalid Name");
					}
					bean.setschedulerName(schedularname1);
					System.out.println("Enter date (mm-dd-yyyy):");
					String date2 = sc.next();
					Validation.dateValid(date2);
					bean.setDeliveryDate(date2);
					System.out.println("Enter quantity:");
					int qty1 = sc.nextInt();
					bean.setschedularQuantity(qty1);
					boolean check = dao.addSchedular(bean);
					if (check) {
						System.out.println("Schedular added to the list:");
					} else {
						System.out.println("Something went wrong:");
					}
					break;
				case 2:
					System.out.println("Enter the schedular id to delete:");
					int schedularId1 = sc.nextInt();
					Validation.idValid(schedularId1);
					boolean check2 = dao.deleteSchedular(schedularId1);
					if (check2) {
						System.out.println("Schedular details deleted..");
					} else {
						System.out.println("Something went wrong!!");
					}
					break;
				case 3:
					System.out.println("Enter Schedular Id:");
					int schedularId11 = sc.nextInt();
					Validation.idValid(schedularId11);
					bean.setschedulerId(schedularId11);
					System.out.println("Enter Schedular Name:");
					String schedularname = sc.next();
					if (!Validation.nameValid(schedularname)) {
						throw new ForestryException("Invalid Name");
					}
					bean.setschedulerName(schedularname);
					System.out.println("Enter date (mm-dd-yyyy):");
					String date1 = sc.nextLine();
					Validation.dateValid(date1);
					bean.setDeliveryDate(date1);
					System.out.println("Enter quantity:");
					int qty = sc.nextInt();
					bean.setschedularQuantity(qty);
					boolean check3 = dao.modifySchedular(bean, schedularId11);
					if (check3) {
						System.out.println("Schedular updated to the list...");
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
} // class ended