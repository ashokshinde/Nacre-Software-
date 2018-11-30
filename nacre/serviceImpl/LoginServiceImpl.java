package com.nacre.serviceImpl;

import com.nacre.daoi.loginDaoi;
import com.nacre.daoimpl.LoginDaoimpl;
import com.nacre.service.LoginServiceI;

public class LoginServiceImpl implements LoginServiceI{

	@Override
	public String loginService(String name, String password) {
	
		LoginDaoimpl login = new LoginDaoimpl();
		
		String s=login.loginDao(name, password);
		
		return s;
	}

}
