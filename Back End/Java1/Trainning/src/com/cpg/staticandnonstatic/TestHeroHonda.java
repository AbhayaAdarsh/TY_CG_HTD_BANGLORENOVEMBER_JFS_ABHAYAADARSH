package com.cpg.staticandnonstatic;

public class TestHeroHonda {
	public static void main(String[] args) 
	 {
		Hero h1=new Hero();
		h1.engine();
		h1.design();
		System.out.println("______________________");
		Honda h2=new Hero();
		h2.engine();
		h2.design();
		System.out.println("______________________");
		HeroHonda h3=new Hero();
		h3.design();

	 }
}
