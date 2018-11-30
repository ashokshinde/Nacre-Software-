package com.nacre.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.service.InsertServiceI;
import com.nacre.serviceImpl.InsertServiceImpl;


@WebServlet("/InsertData")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		
		String username=request.getParameter("uname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		InsertServiceI insertServiceI = new InsertServiceImpl();
		
		String s=insertServiceI.insertservice(username, password, email);
		
		if(s!=null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("jsp/Success.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rdx=request.getRequestDispatcher("jsp/Insert.jsp");
			rdx.forward(request, response);
		}
				 
		}
		
}		
	


