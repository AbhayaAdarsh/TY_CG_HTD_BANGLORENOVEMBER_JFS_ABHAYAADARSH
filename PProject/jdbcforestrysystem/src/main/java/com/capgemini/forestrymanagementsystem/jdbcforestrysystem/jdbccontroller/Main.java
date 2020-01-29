package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbccontroller;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.AdminBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.AdminDaoManager;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.AdminService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("1.ADMIN");
				System.out.println("2.CLIENT");
				System.out.println("3.SCHEDULAR");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					AdminBean bean = new AdminBean();
					AdminService services = AdminDaoManager.instanceOfAdminServiceImpl();
					System.out.println("Enter Admin ID");
					int adminid = sc.nextInt();
					Validation.idValid(adminid);
					bean.setAdminId(adminid);
					System.out.println("Enter Admin Name");
					String adminname = sc.next();
					Validation.nameValid(adminname);
					bean.setAdminName(adminname);
					System.out.println("Enter Admin Password");
					String adminpassword = sc.next();
					bean.setAdminPassword(adminpassword);
					int check = services.AuthenticateAdmin(bean);
					if (check == 0) {
						System.out.println("Authentication Failed");
					} else {
						System.out.println("Authentication Successful");
						Admin.admin();
					}
					break;
				case 2:
					AdminBean bean1 = new AdminBean();
					AdminService services1 = AdminDaoManager.instanceOfAdminServiceImpl();
					System.out.println("Enter Client ID");
					int clientid = sc.nextInt();
					Validation.idValid(clientid);
					bean1.setClientId(clientid);
					System.out.println("Enter Client Name");
					String clientname = sc.next();
					Validation.nameValid(clientname);
					bean1.setClientName(clientname);
					System.out.println("Enter Client Password");
					String clientpassword = sc.next();
					bean1.setClientPassword(clientpassword);
					int check1 = services1.AuthenticateClient(bean1);
					if (check1 == 0) {
						System.out.println("Authentication Failed");
					} else {
						System.out.println("Authentication Successful");
						Client.runClient();
					}
					break;
				case 3:
					AdminBean bean2 = new AdminBean();
					AdminService services2 = AdminDaoManager.instanceOfAdminServiceImpl();
					System.out.println("Enter Schedular ID");
					int schedularid = sc.nextInt();
					Validation.idValid(schedularid);
					bean2.setSchedularId(schedularid);
					System.out.println("Enter Schedular Name");
					String schedularname = sc.next();
					Validation.nameValid(schedularname);
					bean2.setSchedularName(schedularname);
					System.out.println("Enter Admin Password");
					String schedularpassword = sc.next();
					bean2.setSchedularPassword(schedularpassword);
					int check2 = services2.AuthenticateSchedular(bean2);
					if (check2 == 0) {
						System.out.println("Authentication Failed");
					} else {
						System.out.println("Authentication Successful");
						Schedular.schedular();
					}
					break;
				default:
					System.out.println("Invalid option " + option);
					break;
				}
			}
		} catch (NoSuchElementException ns) {
			System.err.println("Try Again");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc != null)
					sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
