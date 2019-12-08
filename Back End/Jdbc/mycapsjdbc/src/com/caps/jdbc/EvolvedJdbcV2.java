package com.caps.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJdbcV2 
{

	public static void main(String[] args) 
	{
		FileReader reader = null;
		Properties prop = null;
		try
		{
			 reader = new FileReader("db.properties");
			 prop = new Properties();
			 prop.load(reader);
			
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver loaded....");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		try(
				Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
						prop.getProperty("dbUser"),
					    prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query"));	
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
