package com.capg.mywebapp.servlrtforjsps;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;
import com.capgemini.mywebapp.services.EmployeeServices;

@WebServlet("/login2")
public class LoginServlet extends HttpServlet {

	private EmployeeServices service=new EmployeeServiceImpl();
			@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the form Data
		int empId = Integer.parseInt(req.getParameter("empId"));
		String password=req.getParameter("password");
		
		EmployeeInfoBean employeeInfoBean=service.authenticate(empId, password);
		if(employeeInfoBean!=null)
		{
			//Valid credentials
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeInfoBean", employeeInfoBean);
			
			req.getRequestDispatcher("./homePageJsp.jsp").forward(req, resp);
			
		}else {
			//Invalid credentials
			req.setAttribute("msg","Invalid Credentials");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
			
		}
	
	}//end of doPost

	
}//End of class
