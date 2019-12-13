package com.cape.phonesimulator;

import java.util.Scanner;

public class Option {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		switch(n)
		{
		case 1:System.out.println("Call Contact");
		break;
		case 2:System.out.println("Message Contact");
		break;
		case 3:System.out.println("Go to MainClass");
		break;
		default :System.out.println("Invalid Contact");
		break;
	}

}
	
}
