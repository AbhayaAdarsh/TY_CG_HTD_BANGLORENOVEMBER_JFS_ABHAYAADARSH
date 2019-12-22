package com.capge.flipkart.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import com.capge.flipkart.bean.ProductBean;

public class Info {
	
	public static void main(String[] args) {
		
		Properties prop = null;
		ProductBean product = null;
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("press 1 to Buy:");
			System.out.println("press 2 to Search again:");
			System.out.println("press 3 to go back to main menu");
			int ch=sc.nextInt();
			switch(ch){
			case 1:
				int no=0 ,num=0;
				System.out.println("You want to Buy a Product.");
				System.out.println("Enter your 16 digit card no.:");
				sc.nextInt(no);
				System.out.println("Enter your 3 digit CVV no.:");
				sc.nextInt(num);
				if(no==16 || num==3) {
					System.out.println("You are able to buy.");
				}else {
					System.out.println("Enter the valid no.");
				}
				
				
				break;
			case 2:
				System.out.println("Search Again:");
				String name=sc.next();
				try{
					Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
						PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("searchQuery"));
				ResultSet rs=pstmt.executeQuery();		
				pstmt.setString(1, product.getPname());
				
				
			 }catch(Exception e) {
				System.out.println(e.getMessage());
			}

				break;
			case 3:
				ProductMain.main(args);
				break;
			}
		}


	}
}
