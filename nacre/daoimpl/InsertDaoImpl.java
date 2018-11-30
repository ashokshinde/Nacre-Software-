package com.nacre.daoimpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InsertDaoImpl extends HttpServlet {
	
	/*String username;
	String password;
	String email;*/
	
	public String InsertDaoi(String username, String password,String email) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ashok");
			 String sql="insert into tbl_registration(username,password,email) values(?,?,?)";
		PreparedStatement st=connection.prepareStatement(sql);
		
	st.setString(1,username);
	st.setString(2,password);
	st.setString(3,email);
	int count=st.executeUpdate();
		
		
		if(count!=0)
		return "success";		
	
		}
		catch(ClassNotFoundException|SQLException cnf)
		{
			cnf.printStackTrace();
		}
		return "OOOOOOOOOOps ...Something HAs wrong";
	}
}
