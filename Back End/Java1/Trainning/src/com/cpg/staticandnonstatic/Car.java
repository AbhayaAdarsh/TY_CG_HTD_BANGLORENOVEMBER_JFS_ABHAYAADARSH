package com.cpg.staticandnonstatic;

public class Car {
	 String brand;
	 int showRoomPrice;
	 double onRoadPrice;
	 boolean isAvailable; 
	 char startingLetter;
	 
	 void carDetails()
	 {
		 System.out.println("Starting letter of a car is "+startingLetter);
		 		System.out.println( "Brand of a car is "+brand);
		 		System.out.println(" Showroom price of a car is "+showRoomPrice);
		 		System.out.println(" Onroad price of a car is "+onRoadPrice);
		 		System.out.println(" It's available or not is "+isAvailable);
	 }
}
