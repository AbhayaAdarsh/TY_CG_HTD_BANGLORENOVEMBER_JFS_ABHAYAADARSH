package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
public class RedirectServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String url="http://www.google.com";//External RESOURCE
		
		
		String url="./currentDate";//INTERNAL RESOURCE
		
		resp.sendRedirect(url);
		}//end of doGet
	}//end of class

