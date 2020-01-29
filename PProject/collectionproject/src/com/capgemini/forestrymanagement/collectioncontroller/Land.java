package com.capgemini.forestrymanagement.collectioncontroller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.capgemini.forestrymanagement.collectionbean.LandBean;
import com.capgemini.forestrymanagement.collectiondao.LandDao;
import com.capgemini.forestrymanagement.collectionmanager.LandDaoManager;

public class Land {
	public static void land() {
		LandDao dao = LandDaoManager.getLanddao();
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
					if (String.valueOf(landNo).length() != 6) {
						System.out.println("Invalid ID Entered!!!\nEnter Again!!");
						landNo = sc.nextInt();
					}
					bean.setLandNo(landNo);
					boolean check = dao.addLand(bean);
					if (check) {
						System.out.println("Land added to the list:");
					} else {
						System.out.println("Something went wrong:");
					}
					break;
				case 2:
					System.out.println("Enter the Land id to delete:");
					int LandId1 = sc.nextInt();
					boolean check2 = dao.deleteLand(LandId1);
					if (check2) {
						System.out.println("Land details deleted..");
					} else {
						System.out.println("Something went wrong!!");
					}
					break;
				case 3:
					System.out.println("Enter Land Id:");
					int prodId = sc.nextInt();
					if (String.valueOf(prodId).length() != 6) {
						System.out.println("Invalid ID Entered!!!\nEnter Again!!");
						landNo = sc.nextInt();
					}
					bean.setLandNo(prodId);
					System.out.println("Enter Land Name:");
					String Landname = sc.next();
					if (!Validation.nameValid(Landname)) {
						System.err.println("Invalid Name Format");
						land();
					}
					bean.setLandlordName(Landname);
					System.out.println("Enter deliver date:");
					String dlvryDate = sc.next();
					System.out.println("Enter quantity:");
					int qty = sc.nextInt();
					bean.setLandNo(prodId);
					bean.setLandlordName(Landname);
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

					boolean check3 = dao.modifyLand(bean);
					if (check3) {
						System.out.println("Land updated to the list...");
					} else {
						System.out.println("Something went wrong !!!");
					}
					break;
				default:
					System.out.println("Invalid Entry.");
					System.out.println("valid number is 1,2,3!!");
					break;

				}// End of Switch
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
}// End of class
