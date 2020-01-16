package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet{

	private String date;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Get the Query String
		//String id1=req.getParameter("id1");
		String id1Val=req.getParameter("id1");
		
		//Get the contextParam
		ServletContext context =getServletContext();
		String contextParamVal =context.getInitParameter("myContextParam");
		
		ServletConfig config =getServletConfig();
		String configParamVal =config.getInitParameter("myConfigParam");
		
		resp.setContentType("text/html");
		resp.setHeader("refresh","1");
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.print("<h2>Current System Date & Time - <br>" + date + "</h2>");
		
		//display context-param value & config-param value
		out.println("<br><br>Context Param Value=" + contextParamVal);
		out.println("<br><br>Config Param Value=" + configParamVal);
		
		
		out.println("<body>");
		//out.println("Employee Id =" + id1);
		out.println("Employee Id =" + id1Val);
		out.println("Name=Abhaya");
		out.println("Salary=60000");
		out.println("</body>");
		out.println("</html>");
		
	}//End of doGet
	
}//End of class