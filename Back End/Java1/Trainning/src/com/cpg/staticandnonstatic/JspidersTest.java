package com.cpg.staticandnonstatic;

public class JspidersTest {
	public static void main(String[] args) 
	 {
		Jspider Hebbal=new Jspider();
		
		Hebbal.swipe();
		Hebbal.swipe();
		Hebbal.swipe();
		
		Jspider BTR=new Jspider();
		
		BTR.swipe();
		BTR.swipe();
		
		System.out.println("Total number of swiped card in BTR is "+BTR.branchStudentCount);
		System.out.println("Total number of swiped card in Hebbal is "+Hebbal.branchStudentCount);
		System.out.println("Total number of Jspiders students swiped card is "+Jspider.totalStudentCount);
	 }

}
