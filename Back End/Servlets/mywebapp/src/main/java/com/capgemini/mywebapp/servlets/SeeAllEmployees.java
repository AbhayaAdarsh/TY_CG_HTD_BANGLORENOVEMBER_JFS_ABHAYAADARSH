package com.capgemini.mywebapp.servlets;

import java.io.IOException;
import java.security.Provider.Service;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;
import com.capgemini.mywebapp.services.EmployeeServices;
@WebService("/")
public class SeeAllEmployees extends HttpServlet {

	private EmployeeServices service =new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session !=null) {
			//Valid session
			List<EmployeeInfoBean> employeeList=service.getAllEmployees();
			if(employeeList!=null && !employeeList.isEmpty()) {
				req.setAttribute("employeeList",employeeList);
				req.getRequestDispatcher("./seeAllEmployeeJsp.jsp").forward(req, resp);
			}else {
				req.setAttribute("msg","There is no Employee Record to display!!");
			}
		}
			else {
				//invalid session
				req.setAttribute("msg","please login first");
				req.getRequestDispatcher("./loginForm").forward(req, resp);
			}
		}
	}
		


