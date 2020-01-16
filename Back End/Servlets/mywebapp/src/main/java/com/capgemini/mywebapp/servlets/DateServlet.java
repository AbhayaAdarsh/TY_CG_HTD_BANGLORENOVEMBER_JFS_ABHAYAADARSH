package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Current system date & time
		Date date =new Date();
		
		//Get the context param
	//	ServletContext context=getServletContext();
		ServletContext context=req.getServletContext();
		String contextParamVal=context.getInitParameter("myContextParam");
		
	//Get Config Param
		ServletConfig config=getServletConfig();
		String configParamVal=config.getInitParameter("");
		
		resp.setContentType("text/html");
		resp.setHeader("refresh", "1");//refresh means how to reload the time again & again  
		
				PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<h2>Current System Date & Time - <br>" + date + "</h2>");
		out.println("<br><br>Context Param Value=" + contextParamVal);
		out.print("</html>");
	}
}