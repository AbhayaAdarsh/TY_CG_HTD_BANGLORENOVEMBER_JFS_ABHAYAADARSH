package com.capgemini.forestrymanagement.collectioncontroller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.capgemini.forestrymanagement.collectionbean.ClientBean;
import com.capgemini.forestrymanagement.collectiondao.ClientDao;
import com.capgemini.forestrymanagement.collectionmanager.ClientDaoManager;

public class Client {
	private static final int ID = 101010;
	private static final String NAME = "Client";
	private static final String PASSWORD = "Client";

	public static void runClient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Client Id:");
		int cid = sc.nextInt();
		System.out.println("Enter Client Name:");
		String cname = sc.next();
		if (cid == ID && cname == NAME) {
			System.out.println("Authentication Successful");
			System.out.println("Enter Client Password:");
			String password = sc.next();
			if (cid == ID && password == PASSWORD) {
				System.out.println("Authentication Successful");
				Contractor.contractor();
			} else {
				System.err.println("Authentication Failed!!!\nTry Again!!");
				runClient();
			}
		}try {
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
					int clientId = sc.nextInt();
					Validation.idValid(clientId);
					bean.setClientId(clientId);
					System.out.println("Enter client name:");
					String clientName = sc.next();
					if (!Validation.nameValid(clientName)) {
						System.err.println("Invalid Name Format");
						System.err.println("Name start with letter it should not contain special character or numeric value!!");
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
					bean.setTown(town);
					System.out.println("Enter the postal code:");
					int postalCode = sc.nextInt();
					bean.setPostalCode(postalCode);
					int lno6 = String.valueOf(postalCode).length();
					if (lno6 != 6) {
						System.err.println("Invalid PostalCode Entered!!!");
						System.err.println("PostalCode should be of six digit!!");
					}
					System.out.println("Enter Email ID:");
					String email = sc.next();
					if (!Validation.emailValid(email)) {
						System.err.println("Invalid Email Format");
						System.err.println("*********@gmail.com is format!!***********");
						client();
					}
					bean.setEmail(email);
					System.out.println("Enter the telephone number:");
					String telephoneNum = sc.next();
					if (!Validation.mobileValid(telephoneNum)) {
						System.err.println("Invalid Mobile Number Format");
						System.err.println("It contains 10 digit!!");
						client();
					}
					bean.setTelephoneNum(telephoneNum);
					try {
					boolean check = dao.addClient(bean);
					if (check) {
						System.out.println("Client added to the list...");
						System.out.println("Client Details are:");
						System.out.println("ID: " + clientId);
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
					}catch(Exception e) {
						e.getMessage();
					}
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
				case 3:
					System.out.println("Enter id to search the Client data:");
					int clientid3 = sc.nextInt();
					ClientBean clientBean = dao.getClient(clientid3);
					int lno7 = String.valueOf(clientid3).length();
					if (lno7 != 6) {
						System.err.println("Invalid ID Entered !!!");
						System.err.println("It should be of 6 digit in length!!");
						client();
					}
					System.out.println(clientBean.toString());
					System.out.println(clientBean.getClientId());
					System.out.println(clientBean.getClientName());
					System.out.println(clientBean.getEmail());
					System.out.println(clientBean.getPostalCode());
					System.out.println(clientBean.getStreetAddress1());
					System.out.println(clientBean.getStreetAddress2());
					System.out.println(clientBean.getTelephoneNum());
					System.out.println(clientBean.getTown());
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
						System.err.println("Invalid ID Entered!!!\nEnter Again!!");
						System.err.println("It should be of 6 digit in length!!");
						clientid1 = sc.nextInt();
					}
					bean.setClientId(clientid1);
					System.out.println("Enter client name:");
					String clientName1 = sc.next();
					if (!Validation.nameValid(clientName1)) {
						System.err.println("Invalid Name Format");
						System.err.println("It contains character only!!");
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
					bean.setTown(town1);
					System.out.println("Enter the postal code:");
					int postalCode1 = sc.nextInt();
					bean.setPostalCode(postalCode1);
					int lno8 = String.valueOf(bean).length();
					if (lno8 != 6) {
						System.err.println("Invalid PostalCode Entered!!!");
						System.err.println("PostalCode should be of six digit!!");
						client();
					}
					System.out.println("Enter Email ID:");
					String email1 = sc.next();
					if (!Validation.emailValid(email1)) {
						System.err.println("Invalid Email Format");
						client();
					}
					bean.setEmail(email1);
					System.out.println("Enter the telephone number:");
					String telephoneNum1 = sc.next();
					if (!Validation.mobileValid(telephoneNum1)) {
						System.err.println("Invalid Mobile Number Format");
						client();
					}
					bean.setTelephoneNum(telephoneNum1);
					boolean check1 = dao.updateClient(bean);
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
