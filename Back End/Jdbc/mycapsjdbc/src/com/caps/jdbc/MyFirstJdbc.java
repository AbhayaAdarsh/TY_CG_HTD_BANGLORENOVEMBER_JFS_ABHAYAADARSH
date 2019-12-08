package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJdbc
{
	public static void main(String[] args)
	{
		Connection conn=null;
		Statement  stmt=null;
		ResultSet rs=null;
		try {
			//Load the Driver
//			Driver driver = new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");
			
			//Get the DB Connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/TY_CG_Nov6"
					+ "?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection established....");
			
			//Issue the SQL Queries via connection
			String query = "SELECT * FROM users_info";
			stmt = conn.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Query Issued....");
			System.out.println("*********************************");
			
			//Process the results returned by SQL Queries
			while(rs.next())
			{
				System.out.println("UserId : "+rs.getInt("userId"));
				System.out.println("UserName : "+rs.getString("username"));
				System.out.println("e-Mail : "+rs.getString("email"));
				System.out.println("*********************************");
			}
			
		    } 
		catch (Exception e) 
		{		
			e.printStackTrace();
		}
		
		
		//Close all the JDBC objects
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
