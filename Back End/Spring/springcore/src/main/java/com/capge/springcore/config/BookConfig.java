package com.capge.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.capge.springcore.beans.Author;
import com.capge.springcore.beans.Book;


public class BookConfig {


	private String Novel;
	private Author AbirR;

	@Bean("Novel")
	@Scope("protptype")
	public Book getBook() {
	
	Book book=new Book(Novel,AbirR );
	return book;
		
	}
	
	@Bean("JungleBook")
	@Primary
	public JungleBook getJungleBook() {
		return new JungleBook();
		}
	
	//WIRED
	@Bean("NewNovel")
	public NewNovel getNewNovel() {
		NewNovel nn= new NewNovel();
		nn.setAuthor("KabirK");
		
		nn.setName(getJungleBook());//Auto Wired
		return nn;
	}
	
}	
	
