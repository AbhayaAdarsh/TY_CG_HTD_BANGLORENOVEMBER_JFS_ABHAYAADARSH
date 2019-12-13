package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLoginDynamic 
{
	public static void main(String[] args) 
	{
		
	
	Scanner sc=new Scanner(System.in);
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	PreparedStatement pstmt=null;

	try 
	{
		//Load the Driver
		Driver driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver Loaded....");
		
		//Get the DB Connection via Driver
		String dbUrl = "jdbc:mysql://127.0.0.1:3306/TY_CG_Nov6";
		System.out.println("Enter UserName and Password ");
		String dbUser=sc.nextLine();
		String dbPassword=sc.nextLine();
		conn=DriverManager.getConnection(dbUrl,dbUser,dbPassword);
		System.out.println("Connection established....");
		
		//Issue the SQL Queries via connection
		String query = "SELECT *FROM users_info "
				+ "where userid=? and password=? ";
		
		pstmt=conn.prepareStatement(query);
		System.out.println("Enter User-Id : ");
		pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Password : ");
		pstmt.setString(2, sc.nextLine());
		rs=pstmt.executeQuery();

		System.out.println("Query Issued and executed....");
		//Process the results returned by the SQL Queries
		if(rs.next())
		{
			System.out.println("UserId : "+rs.getInt(1));
			System.out.println("UserName : "+rs.getString(2));
			System.out.println("Email : "+rs.getString("email"));
			
		}
		else
		{
			System.err.println("Something went wrong...");
		}
		System.out.println("***************************");
	} 
	
	catch(SQLException e)
	{			
		e.printStackTrace();
	}
	

	
	//Close all the JDBC Objects
	finally
	{
		if(conn!=null)
		{
			try 
			{
				conn.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				if(stmt!=null)
				{
					stmt.close();
				}
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				if(rs!=null)
				{
					rs.close();
				}
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}
	}
}
}