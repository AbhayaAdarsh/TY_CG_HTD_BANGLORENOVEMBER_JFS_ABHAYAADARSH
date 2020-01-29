package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbccontroller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcexception.ForestryException;

public class Validation {
	private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	static int a;

	public static void idValid(int id) throws ForestryException {
		if (String.valueOf(id).length() != 6) {
			System.out.println("Invalid ID Entered!!!\nEnter Again!!");
			Client.client();
		}
	}

	public static boolean nameValid(String name) {
		return (Pattern.matches("[a-zA-Z]+", name));
	}

	public static boolean emailValid(String email) {
		Pattern a = Pattern.compile(EMAIL_REGEX);
		Matcher z = a.matcher(email);
		return z.find();
	}

	public static boolean mobileValid(String telephoneNum) {
		Pattern p2 = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m2 = p2.matcher(telephoneNum);
		return m2.find();
	}

	public static void dateValid(String dlvryDate) {
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		try {
			Date date = format.parse(dlvryDate);
			Date d1 = new Date();
			if (date.compareTo(d1) < 0) {
				System.out.println("Date is Invalid!!!");
			} else {
				System.out.println("Date is Valid");
			}
		} catch (ParseException e) {
			System.err.println("Incorrect Format");
		}
	}
}
