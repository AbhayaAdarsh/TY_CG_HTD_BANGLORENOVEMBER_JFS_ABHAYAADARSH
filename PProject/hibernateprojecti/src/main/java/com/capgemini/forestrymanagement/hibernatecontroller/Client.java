package com.capgemini.forestrymanagement.hibernatecontroller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.capgemini.forestrymanagement.hibernatebean.ClientBean;
import com.capgemini.forestrymanagement.hibernatedao.ClientDao;
import com.capgemini.forestrymanagement.hibernatemanager.ClientDaoManager;

import java.util.InputMismatchException;

public class Client {

	private static final int ID = 101010;
	private static final String NAME = "Client";

	public static void runClient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Client Id:");
		int cid = sc.nextInt();
		System.out.println("Enter Client Name:");
		String cname = sc.next();
		if (cid == ID && cname == NAME) {
			System.out.println("Authentication Successful");
			Contractor.contractor();
		} else {
			System.err.println("Authentication Failed!!!\nTry Again!!");
			runClient();
		}
		try {
			if (sc != null)
				sc.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public static void client() {
		ClientDao dao = ClientDaoManager.getClientdao();
		Scanner sc = new Scanner(System.in);
		ClientBean bean = new ClientBean();
		try {
			while (true) {
				System.out.println("******************Client DETAILS****************");
				System.out.println("1.Add Client");
				System.out.println("2.Delete Client");
				System.out.println("3.Search Client");
				System.out.println("4.Display Client");
				System.out.println("5.Modify Client");
				System.out.println("Enter your choice:");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Client id:");
					int clientid = sc.nextInt();
					Validation.idValid(clientid);
					bean.setClientId(clientid);
					System.out.println("Enter client name:");
					String clientName = sc.next();
					if (!Validation.nameValid(clientName)) {
						System.err.println("Invalid Name Format");
						client();
					}
					bean.setClientName(clientName);
					System.out.println("Enter the street Address1:");
					String streetAddress1 = sc.next();
					bean.setStreetAddress1(streetAddress1);
					System.out.println("Enter the street Address2:");
					String streetAddress2 = sc.next();
					bean.setStreetAddress2(streetAddress2);
					System.out.println("Enter Town:");
					String town = sc.next();
					bean.settown(town);
					System.out.println("Enter the postal code:");
					int postalCode = sc.nextInt();
					bean.setPostalCode(postalCode);
					System.out.println("Enter Email ID:");
					String email = sc.next();
					if (!Validation.emailValid(email)) {
						System.err.println("Invalid Email Format");
						client();
					}
					bean.setemail(email);
					System.out.println("Enter the telephone number:");
					String telephoneNum = sc.next();
					try {
						if (!Validation.mobileValid(telephoneNum)) {
							System.err.println("Invalid Mobile Number Format");
							client();
						}
						bean.settelephoneNum(telephoneNum);
					} catch (InputMismatchException ime) {
						System.err.println("Try Again");
					}
					boolean check = dao.addClient(bean);
					if (check) {
						System.out.println("Client added to the list...");
						System.out.println("Client Details are:");
						System.out.println("ID: " + clientid);
						System.out.println("Name: " + clientName);
						System.out.println("Address1: " + streetAddress1);
						System.out.println("Address2: " + streetAddress2);
						System.out.println("Town: " + town);
						System.out.println("PostalCode: " + postalCode);
						System.out.println("Email: " + email);
						System.out.println("Telephone No: " + telephoneNum);
					} else {
						System.out.println("Something went wrong!!!");
					}
					break;
				case 2:
					System.out.println("Enter the Client Id which you want to delete:");
					int clientid2 = sc.nextInt();
					boolean check2 = dao.deleteClient(clientid2);
					if (check2) {
						System.out.println("Client details Deleted..");
					} else {
						System.out.println("Something went wrong!!!");
					}
					break;
				case 4:
					System.out.println("Client Records :");
					List<ClientBean> list = dao.getAllClient();
					if (list != null) {
						for (ClientBean user : list) {
							System.out.println(user);
						}
					} else {
						System.out.println("No Client found!!!");
					}
					break;
				case 5:
					System.out.println("Enter Client id:");
					int clientid1 = sc.nextInt();
					if (String.valueOf(clientid1).length() != 6) {
						System.out.println("Invalid ID Entered!!!\nEnter Again!!");
						clientid1 = sc.nextInt();
					}
					bean.setClientId(clientid1);
					System.out.println("Enter client name:");
					String clientName1 = sc.next();
					if (!Validation.nameValid(clientName1)) {
						System.err.println("Invalid Name Format");
						client();
					}
					bean.setClientName(clientName1);
					System.out.println("Enter the street Address1:");
					String streetAddress11 = sc.next();
					bean.setStreetAddress1(streetAddress11);
					System.out.println("Enter the street Address2:");
					String streetAddress22 = sc.next();
					bean.setStreetAddress2(streetAddress22);
					System.out.println("Enter Town:");
					String town1 = sc.next();
					bean.settown(town1);
					System.out.println("Enter the postal code:");
					int postalCode1 = sc.nextInt();
					bean.setPostalCode(postalCode1);
					System.out.println("Enter Email ID:");
					String email1 = sc.next();
					if (!Validation.emailValid(email1)) {
						System.err.println("Invalid Email Format");
						client();
					}
					bean.setemail(email1);
					System.out.println("Enter the telephone number:");
					String telephoneNum1 = sc.next();
					if (!Validation.mobileValid(telephoneNum1)) {
						System.err.println("Invalid Mobile Number Format");
						client();
					}
					bean.settelephoneNum(telephoneNum1);
					boolean check1 = dao.updateClient(bean, clientid1);
					if (check1) {
						System.out.println("Client added to the list...");
						System.out.println("Client Details are:");
						System.out.println("ID: " + clientid1);
						System.out.println("Name: " + clientName1);
						System.out.println("Address1: " + streetAddress11);
						System.out.println("Address2: " + streetAddress22);
						System.out.println("Town: " + town1);
						System.out.println("PostalCode: " + postalCode1);
						System.out.println("Email: " + email1);
						System.out.println("Telephone No: " + telephoneNum1);
					} else {
						System.out.println("Something went wrong!!!");
					}
					break;
				}
			}
		} catch (InputMismatchException ime) {
			System.err.println("Try Again");
		} catch (NoSuchElementException ns) {
			System.err.println("Try Again");
		} finally {
			try {
				if (sc != null)
					sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}// End of Class
