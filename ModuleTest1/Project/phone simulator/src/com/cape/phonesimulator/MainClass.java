package com.cape.phonesimulator;

import java.util.Scanner;

public class MainClass {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

switch(n)
{
case 1:AllContact.main(args);
break;
case 2:SearchInfo.main(args);
break;
case 3:Option.main(args);
break;
default :System.out.println("Invalid Contact");
break;
}
}
}
