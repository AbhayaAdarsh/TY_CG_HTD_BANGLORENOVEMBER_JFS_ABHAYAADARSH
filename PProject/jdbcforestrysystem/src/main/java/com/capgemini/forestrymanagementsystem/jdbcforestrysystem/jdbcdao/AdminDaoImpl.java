package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.AdminBean;

public class AdminDaoImpl implements AdminDao {
	FileReader reader;
	Properties prop;
	AdminBean bean;
	ResultSet rs;
	int count;

	public AdminDaoImpl() {
		try {
			reader = new FileReader("info.properties");
			prop = new Properties();
			prop.load(reader);
			bean = new AdminBean();
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int AuthenticateAdmin(AdminBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword")); Statement st = conn.createStatement();) {
			int id = bean.getAdminId();
			String name = bean.getAdminName();
			String pass = bean.getAdminPassword();
			String query = "select count(*) from account_info where id='" + id + "' and name='" + name
					+ "' and password='" + pass + "' and role='Admin'";
			if (st != null)
				rs = st.executeQuery(query);
			if (rs != null) {
				if (rs.next())
					count = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return count;
	}

	@Override
	public int AuthenticateClient(AdminBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword")); Statement st = conn.createStatement();) {
			int id = bean.getClientId();
			String name = bean.getClientName();
			String pass = bean.getClientPassword();
			String query = "select count(*) from account_info where id='" + id + "' and name='" + name
					+ "' and password='" + pass + "' and role='Client'";
			if (st != null)
				rs = st.executeQuery(query);
			if (rs != null) {
				if (rs.next())
					count = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return count;
	}

	@Override
	public int AuthenticateSchedular(AdminBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword")); Statement st = conn.createStatement();) {
			int id = bean.getSchedularId();
			String name = bean.getSchedularName();
			String pass = bean.getSchedularPassword();
			String query = "select count(*) from account_info where id='" + id + "' and name='" + name
					+ "' and password='" + pass + "' and role='Schedular'";
			if (st != null)
				rs = st.executeQuery(query);
			if (rs != null) {
				if (rs.next())
					count = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return count;
	}
}
