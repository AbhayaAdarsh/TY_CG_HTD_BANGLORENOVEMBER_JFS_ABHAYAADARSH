package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.services.EmployeeServiceImpl;
import com.capgemini.mywebapp.services.EmployeeServices;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet{
private EmployeeServices service =new EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession(true);
		
		if(session!=null) {
		//Valid Session
			
		int empId=Integer.parseInt(req.getParameter("empId"));
			
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		if(service.deleteEmployee(empId))
		{
			out.println("<h3 style='color:red'>Employee Records for"+ empId +"deleted</h3>");
			
		}else {
			out.println("<h3 style='color:red'>Employee Id"+ empId +"not found</h3>");
		}
		out.println("</body>");
		out.println("</html>");
		}
		
		else {
			//Invalid session
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style='color:red'>Invalid Credentials</h3>");
			out.println("</body>");
			out.println("</html>");
			
			req.getRequestDispatcher("./LoginPage.html").include(req, resp);
		}
		
		}//end of doGet

}//end of class
