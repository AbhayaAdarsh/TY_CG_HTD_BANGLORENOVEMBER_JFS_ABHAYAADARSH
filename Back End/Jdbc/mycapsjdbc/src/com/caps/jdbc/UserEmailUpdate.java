package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate 
{
	public static void main(String[] args) 
	{
		    Scanner sc=new Scanner(System.in);		   
            Connection conn=null;
            PreparedStatement pstmt=null;
            try 
    		{
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded....");
			
			//Get the DB Connection via Driver
			String dbUrl="jdbc:mysql://localhost:3306/TY_CG_Nov6";
			System.out.println("Enter User and password : ");
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl, user,password);
			System.out.println("Connection Established....");
			
			//Issue SQL QUeries via connection
			String query=" update users_info set email = ?"
					+ "where userid=? and password =?";
			pstmt=conn.prepareStatement(query);
			
			System.out.println("Enter User-ID: ");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter e-mail: ");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter Password to update: ");
			pstmt.setString(3,sc.nextLine());
			
			int count=pstmt.executeUpdate();
			
			//Process the results returned by the SQL Queries
			if(count > 0)
			{
				System.out.println("Query OK..."+count+ " row has been affected");
			}
			else
			{
				System.err.println("Something went wrong....");
			}
			System.out.println("Query is issued....");
			sc.close();
	   } 
	      catch (Exception e)
          {
		    e.printStackTrace();
	       }
			//Close all the JDBC objects
            finally
            {
            	if(pstmt!=null)
    			{
    				try 
    				{
    				pstmt.close();
    				} 
    				catch (SQLException e) 
    				{
    					e.printStackTrace();
    				}
    			}
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
    		  }
            }
	}
}
