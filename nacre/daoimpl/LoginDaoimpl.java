package com.nacre.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.nacre.daoi.loginDaoi;

public class LoginDaoimpl implements loginDaoi {
	String s;

	@Override
	public String loginDao(String name, String pass) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ashok");
		
		Statement st=connection.createStatement();
		
		
		ResultSet rs=st.executeQuery("Select username,password from tbl_registration");
		
		if(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2));
			 s="Success";
		}
	
		
		}
		catch(ClassNotFoundException|SQLException cnf)
		{
			cnf.printStackTrace();
		}
		return s;
	}
	

}
