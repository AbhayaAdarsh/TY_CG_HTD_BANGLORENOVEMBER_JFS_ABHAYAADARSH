package com.cpg.objectclass;

public class Demo3
{

	  public static void main(String[] args)
	  {
		String s1="Joey";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		String s2="Phoebe";
		System.out.println(s2.length());
		
		String s3="     Joey   John   ";
		System.out.println(s3.trim());
		
		String s4="JAVA DEVELOPERS";
		System.out.println(s4.substring(3));
		System.out.println(s4.substring(1,3));
		
		String s5="Ross";
		System.out.println(s5.charAt(2));

	  }
}
