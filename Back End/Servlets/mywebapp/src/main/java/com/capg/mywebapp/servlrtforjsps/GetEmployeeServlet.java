package com.capg.mywebapp.servlrtforjsps;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;
import com.capgemini.mywebapp.services.EmployeeServices;

@WebServlet("/getEmployee")
public class GetEmployeeServlet extends HttpServlet {

  private static final HttpServletRequest req = null;
private EmployeeServices service= new EmployeeServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session !=null){
			//	Valid Session
			//Get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			EmployeeInfoBean employeeInfoBean=service.searchEmployee(empId);
			
		}else {
			//Invalid Session
			req.setAttribute("msg", "Please Login First!");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
			
		}
	
	}//end of doGet

}//end of class