package com.capgemini.forestrymanagement.collectioncontroller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.capgemini.forestrymanagement.collectionbean.SchedularBean;
import com.capgemini.forestrymanagement.collectiondao.SchedularDao;
import com.capgemini.forestrymanagement.collectionmanager.SchedularDaoManager;

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
					System.out.println("Enter Schedularid:");
					int schedularId = sc.nextInt();
					if (String.valueOf(schedularId).length() != 6) {
						System.out.println("Invalid ID Entered!!!\nEnter Again!!");
						schedularId = sc.nextInt();
					}
					bean.setSchedulerId(schedularId);
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
					if (String.valueOf(schedularId11).length() != 6) {
						System.out.println("Invalid ID Entered!!!\nEnter Again!!");
						schedularId11 = sc.nextInt();
					}
					bean.setSchedulerId(schedularId11);
					System.out.println("Enter Schedular Name:");
					String schedularname = sc.next();
					if (!Validation.nameValid(schedularname)) {
						System.err.println("Invalid Name Format");
						schedular();
					}
					bean.setSchedulerName(schedularname);
					System.out.println("Enter deliver date:");
					String dlvryDate = sc.next();
					System.out.println("Enter quantity:");
					int qty = sc.nextInt();
					bean.setSchedulerId(schedularId11);
					bean.setSchedulerName(schedularname);
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
						e.printStackTrace();
					}
					boolean check3 = dao.modifySchedular(bean);
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

}
