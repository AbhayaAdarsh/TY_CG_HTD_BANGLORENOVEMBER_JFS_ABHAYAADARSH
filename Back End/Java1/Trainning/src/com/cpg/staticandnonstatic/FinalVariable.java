package com.cpg.staticandnonstatic;

public class FinalVariable {
	final double PI;
	 
	 public FinalVariable(double PI)
	 {
		 this.PI=PI;
	 }
	 public FinalVariable(int a,double PI)
	 {
		 this.PI=PI;
	 }
	 void disp()
	 {
		 System.out.println(PI);
	 }
}
