package com.cpg.staticandnonstatic;

public class TestCat {
	public static void main(String[] args)
	 {
		Chips c1=new Chips();
		Lays l1=new Lays();
		KurKure k1=new KurKure();
		Bingo b1=new Bingo();
		
		Cat c2=new Cat();
		c2.feedChips(c1);
		c2.feedChips(l1);
		c2.feedChips(b1);
	    c2.feedChips(k1);	
	 }
}
