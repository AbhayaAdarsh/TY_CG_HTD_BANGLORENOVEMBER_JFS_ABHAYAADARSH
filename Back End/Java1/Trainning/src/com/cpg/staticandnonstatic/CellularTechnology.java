package com.cpg.staticandnonstatic;

public class CellularTechnology 
{
	public static void main(String[] args)
	 {
		FirstGeneration fg=new FirstGeneration();
		fg.call();
		fg.text();
		System.out.println();
		
		SecondGeneration sg=new SecondGeneration();
		sg.call();
		sg.text();
		sg.radio();
		System.out.println();
		
		ThirdGeneration tg=new ThirdGeneration();
		tg.call();
		tg.text();
		tg.radio();
		tg.camera();
		tg.internet();
		System.out.println();
		
		FirstGeneration fg1=new ThirdGeneration();
		fg1.call();
		fg1.text();
		System.out.println();
		
		SecondGeneration sg1=new ThirdGeneration();
		sg1.call();
		sg1.text();
		sg1.radio();
		System.out.println();
		
	 }
}
