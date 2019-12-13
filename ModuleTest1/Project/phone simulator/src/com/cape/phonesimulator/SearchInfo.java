package com.cape.phonesimulator;

		import java.io.FileReader;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.Statement;
		import java.util.ArrayList;
		import java.util.List;
		import java.util.Properties;
		

		public class SearchInfo<AllContact> implements Search
		{

		    private static final boolean AllContactList = false;
			private static final String ContactNames = null;
			FileReader reader;
			Properties prop ;
			private ResultSet rs;
			private Object contact;
			
		public SearchInfo()
		{
		try 
		{
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("mainClass"));

		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		@Override
		public List<AllContact> getAllContact()
		{
		List<AllContact> list=new ArrayList<AllContact>();
		try
		{
				Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				                  prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				String query1;
				ResultSet rs=stmt.executeQuery(prop.getProperty(query1));
				
		

		while(rs.next())
		{
			AllContact contact=new AllContact();
			contact.setContactNumber(rs.getInt(1));
			contact.setContactName(rs.getString(2));
			list.add(contact);
			
		}

		return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		}

		@Override
		public  boolean SearchInfo(String ContactName, int ContactNumber,String ContactGroup) {
			return false;
		}
		{
			try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
			        prop.getProperty("dbUser"),prop.getProperty("dbPassword"));          
					PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertQuery"));
					{
						
					pstmt.setString(1,getContactName());
					pstmt.setInt(2,getContactNumber());
					pstmt.setString(3,getContactGroup());
			    
					int count=pstmt.executeUpdate();
					
					if(count > 0)
					{
						return true;
					}
					}
			catch (Exception e) 
			{
			  e.printStackTrace();
			}
			return false;

		}

		@Override
		public boolean updateAllContact(String Contactname,int ContactNumber,String ContactGroup)
		{
		// TODO Auto-generated method stub
		return false;
		}
		
		private String getContactName() {
			// TODO Auto-generated method stub
			return null;
		}
		private int getContactNumber() {
			// TODO Auto-generated method stub
			return 0;
		}
		private String getContactGroup() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean addAllContact(String Contactname,int ContactNumber,String ContactGroup)
		{
			ArrayList<String> list=new ArrayList<String>();
			ArrayList<String> getAllContactList()
			{
				return AllContactList;
			}
			public void storeContacts(String ContactName)
			{
				AllContactList.add(ContactNames);
			}
		return false;
		}
		@Override
		public boolean deleteAllContact(String Contactname,int ContactNumber,String ContactGroup ) 
		{
		// TODO Auto-generated method stub
		return false;
		}
		@Override
		public boolean searchAllContact(String Contactname,int ContactNumber,String ContactGroup ) 
		{
		// TODO Auto-generated method stub
		return false;
		}
		
		@Override
		public boolean callAllContact(String Contactname,int ContactNumber,String ContactGroup ) 
		{
		// TODO Auto-generated method stub
		return false;
		}
		
		@Override
		public boolean messageAllContact(String Contactname,int ContactNumber,String ContactGroup ) 
		{
		// TODO Auto-generated method stub
		return false;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		}
		
		

			
		}

		
	
	