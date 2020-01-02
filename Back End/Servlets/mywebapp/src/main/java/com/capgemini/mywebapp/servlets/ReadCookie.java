package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readcookie")
public class ReadCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the cookies
		Cookie[] cookies= req.getCookies();
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		req.getRequestDispatcher("./cookiePage.html").include(req, resp);
		
		out.print("<html>");
		out.print("<body>");
		
		if(cookies !=null) {
		for(Cookie cookie:cookies)
		{
			out.println("<h3>Cookie Name =" + cookie.getName());
			out.println("<br>Cookie value=" + cookie.getValue()+ "</h3>");
		}
		}else {
			out.println("<br><h2>Cookies Not Found!</h2>");
		}
			out.print("</body>");
			out.print("</html>");
		
	}//End of doGet()
}//End of class
