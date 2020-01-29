package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbccontroller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ClientBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcexception.ForestryException;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.ClientDaoManager;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice.ClientServices;

public class Client {
	public static void runClient() throws ForestryException {
		System.out.println("Welcome Client\nDo Operate Contractor Now");
		Contractor.contractor();
	}

	public static void client() throws ForestryException {
		ClientServices services = ClientDaoManager.instanceOfClientServiceImpl();
		ClientBean bean = new ClientBean();
		Scanner sc = new Scanner(System.in);
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
					bean.setClientid(clientid);
					System.out.println("Enter client name:");
					String clientName = sc.next();
					if (!Validation.nameValid(clientName)) {
						throw new ForestryException("Invalid Name");
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
					System.out.println("Enter Email ID:");
					String email = sc.next();
					if (!Validation.emailValid(email)) {
						throw new ForestryException("Invalid Email");
					}
					bean.setEmail(email);
					System.out.println("Enter the telephone number:");
					String telephoneNum = sc.next();
					if (!Validation.mobileValid(telephoneNum)) {
						throw new ForestryException("Invalid Mobile Number");
					}
					bean.setTelephoneNum(telephoneNum);
					boolean check = services.addClient(bean);
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
					boolean check2 = services.deleteClient(clientid2);
					if (check2) {
						System.out.println("Client details Deleted..");
					} else {
						System.out.println("Something went wrong!!!");
					}
					break;
				case 3:
					System.out.println("Enter id to search the Client data:");
					int clientid3 = sc.nextInt();
					Validation.idValid(clientid3);
					ClientBean clientBean = services.getClient(clientid3);
					System.out.println(clientBean.toString());
					System.out.println(clientBean.getClientid());
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
					List<ClientBean> list = services.getAllClient();
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
					Validation.idValid(clientid1);
					bean.setClientid(clientid1);
					System.out.println("Enter client name:");
					String clientName1 = sc.next();
					if (!Validation.nameValid(clientName1)) {
						throw new ForestryException("Invalid Name");
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
					System.out.println("Enter Email ID:");
					String email1 = sc.next();
					if (!Validation.emailValid(email1)) {
						throw new ForestryException("Invalid Email");
					}
					bean.setEmail(email1);
					System.out.println("Enter the telephone number:");
					String telephoneNum1 = sc.next();
					if (!Validation.mobileValid(telephoneNum1)) {
						throw new ForestryException("Invalid Mobile Number");
					}
					bean.setTelephoneNum(telephoneNum1);
					boolean check1 = services.updateClient(bean);
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}// End of Class
