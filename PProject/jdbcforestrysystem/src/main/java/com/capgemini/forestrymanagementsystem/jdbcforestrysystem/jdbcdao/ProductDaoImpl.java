package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ProductBean;

public class ProductDaoImpl implements ProductDao {
	FileReader reader;
	Properties prop;
	ProductBean bean;

	public ProductDaoImpl() {
		try {
			reader = new FileReader("product.properties");
			prop = new Properties();
			prop.load(reader);
			bean = new ProductBean();
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"));) {
			pstmt.setInt(1, bean.getProductId());
			pstmt.setString(2, bean.getProductName());
			pstmt.setString(3, bean.getDeliveryDate());
			pstmt.setInt(4, bean.getQuantity());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int productid) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"));) {
			pstmt.setInt(1, productid);
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean modifyProduct(ProductBean bean) {
		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateQuery"));) {
			pstmt.setInt(1, bean.getProductId());
			pstmt.setString(2, bean.getProductName());
			pstmt.setString(3, bean.getDeliveryDate());
			pstmt.setInt(4, bean.getQuantity());
			int count = pstmt.executeUpdate();
			if (count > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
