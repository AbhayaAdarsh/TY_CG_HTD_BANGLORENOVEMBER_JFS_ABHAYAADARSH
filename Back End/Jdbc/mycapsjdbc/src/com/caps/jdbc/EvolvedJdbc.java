package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJdbc 
{

	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		String dbUrl = "jdbc:mysql://127.0.0.1:3306/TY_CG_Nov6";
		System.out.println("Enter UserName and Password ");
		String dbUser=sc.nextLine();
		String dbPassword=sc.nextLine();
		String query="SELECT * FROM users_info";
		try(
				Connection conn = 
				DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			    Statement stmt= conn.createStatement();
			    ResultSet rs=stmt.executeQuery(query);
				)
		{
			while(rs.next())
			{
				System.out.println("User-ID: "+rs.getInt(1));
				System.out.println("Username: "+rs.getString(2));
				System.out.println("Email: "+rs.getString(3));
				System.out.println("*****************************");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
