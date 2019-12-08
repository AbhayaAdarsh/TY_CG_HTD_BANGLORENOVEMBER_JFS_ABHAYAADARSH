package com.cpg.staticandnonstatic;

public class Choclate {
	String name;
	 String flavour;
	 double price;
	 
	 public Choclate(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}
	void Chocolate( String name,String flavour,double price)
	 {
		 this.name=name;
		 this.flavour=flavour;
		 this.price=price;
	 }
	 public void details()
	 {
		 System.out.println("Name of a chocolate is "+name+ " Flavour of a chocolate is "+flavour+" Price of a chocolate is "+price);
	 }
}
