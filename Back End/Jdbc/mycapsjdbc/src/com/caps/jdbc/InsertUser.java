package com.caps.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser 
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			//Load the Driver
			Driver d =new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(d);
			System.out.println("Driver is loaded...");
			
			//Get the DB Connection via Driver
			String dbUrl="jdbc:mysql://127.0.0.1:3306/TY_CG_Nov6";
			System.out.println("Enter User and Password : ");
			String dbUser=sc.nextLine();
			String dbPassword=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPassword);
			System.out.println("Connection established...");
			
			//Issue SQL Queries via Connection
			String query="INSERT INTO USERS_INFO VALUES(?,?,?,?)";
					
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter UserId: ");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter UserName: ");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter e-mail: ");
			pstmt.setString(3, sc.nextLine());
			System.out.println("Enter Password: ");
			pstmt.setString(4, sc.nextLine());
			System.out.println("Query is issued and executed...");
			
			int count=pstmt.executeUpdate();
			if(count > 0)
			{
				System.out.println("User Inserted");
			}
			else
			{
				System.err.println("Something went wrong...");
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		//Close all JDBC objects
		finally
		{
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null)
			{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
			
		}
		}
}
