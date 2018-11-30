package com.nacre.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.service.LoginServiceI;
import com.nacre.serviceImpl.LoginServiceImpl;

@WebServlet("/login")
public class LoginServlett extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("un");
		String pass=req.getParameter("pass");
		
		
		LoginServiceI loginServiceI=new LoginServiceImpl();
		String s=loginServiceI.loginService(name, pass);
		System.out.println("===="+s+""+name);
		
		if(s!=null){
												
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("jsp/Success.jsp");
		requestDispatcher.forward(req, resp);
		
		}
		
	}
	

}
