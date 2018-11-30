package com.nacre.serviceImpl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.daoimpl.InsertDaoImpl;
import com.nacre.service.InsertServiceI;



public class InsertServiceImpl  implements  InsertServiceI {
	public String insertservice(String username,String password,String email)
	{
		InsertDaoImpl insert=new InsertDaoImpl();
		String s=insert.InsertDaoi(username, password, email);
		
	return s;	
	}

}
