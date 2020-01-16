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
@WebServlet("./addEmployee")
public class AddEmployeeServletWithJsp extends HttpServlet{

	private EmployeeServices service= new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			//valid session
			//get the form data
			int empld=Integer.parseInt(req.getParameter("empId"));
			String name=req.getParameter("name");
			int age=Integer.parseInt(req.getParameter("age"));
			double salary=Double.parseDouble(req.getParameter("salary"));
			String designation=req.getParameter("designation");
			String password=req.getParameter("password");
			
			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
			employeeInfoBean.setName(name);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);
			//create object of service
			boolean isAdded =service.addEmployee(employeeInfoBean);
			if(isAdded) {
				req.setAttribute("msg","Employee Record Inserted Successfully");
			}
			else {
				req.setAttribute("msg","Unable to Insert Employee Record .");
			}
		//	req.setAttribute("employeeInfoBean",employeeInfoBean);//we will set attribute because we want to display the msg via jsppage on the same jsp page
		//	req.getRequestDispatcher("./AddEmpJspForm.jsp").forward(req, resp);
			
		}else{
			//invalid session
			req.setAttribute("msg","please login first");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
	}//end of doPost
}//end of class