package com.capgemini.retailermaintenancesystemapplication.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="retailer_db")
public class ProductInfoBean {

		@Id
		@Column
		@GeneratedValue
		private int id;
		@Id
		@Column
		private int userid;
		@Column
		private String name;
		@Column
		private int quantity;
		@Column(unique =true,nullable =false)
		private String details;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getDetails() {
			return details;
		}
		public void setDetails(String details) {
			this.details = details;
		}
		public String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}
		public void setPassword(String password) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
		
		
}