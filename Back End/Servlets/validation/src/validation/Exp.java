package validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exp {
	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter date (mm-dd-yyyy)");
String date1=sc.nextLine();

SimpleDateFormat format=new SimpleDateFormat("mm-dd-yyyy");


try {
	Date date = format.parse(date1);
	String dateInput=format.format(date);
	System.out.println(dateInput);
	
	Date d1=format.parse("02-14-2020");
	String dateLimit=format.format(d1);
	
	if(date.compareTo(d1)>0) {
		System.out.println("Date is Invalid ");
	}
	else if(date.compareTo(d1)<0) {
		System.out.println("Date is Valid");
	}
	else if(date.compareTo(d1)==0) {
		System.out.println("Date is Invalid *Same Dates");
	}
	
	System.out.println("Your Input " +dateInput);
	System.out.println("Limit is " +dateLimit);
	
} catch (ParseException e) {
	e.printStackTrace();
}
}
}




