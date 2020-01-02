package com.capgemini.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;
import com.capgemini.mywebapp.services.EmployeeServices;

import net.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool.Record;

@WebServlet("./deleteEmployee")
public class DeleteEmployeeServletWithJsp extends HttpServlet{
	private EmployeeServices service =new EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session= req.getSession(false);
		if(session!=null) {
			//Valid Session
			int empId=Integer.parseInt(req.getParameter("empId"));
			boolean isDeleted=service.deleteEmployee(empId);
			if(isDeleted) {
				req.setAttribute("msg","Record for Employee Id"+ empId + "Deleted!");
			}else {
				req.setAttribute("msg","Employee Id"+ empId + "Not Found!");
			}
			req.getRequestDispatcher("./deleteEmployeeJsp.jsp").forward(req, resp);
		}else{
				//invalid session
				req.setAttribute("msg","please login first");
				req.getRequestDispatcher("./loginForm").forward(req, resp);
			}
		
	}//end of doGet
}//end of class
