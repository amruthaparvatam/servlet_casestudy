package com.res.userservice;

import com.res.userdao.UserDao;

public class UserService {
	
	UserDao userDao;
	
	public UserService() {
		userDao = new UserDao();

	}

	public String addUserDetails(int Id,String Name, String Gender, String Category, String Email, int Mobile) {
		
		String name = userDao.addUserDetails(Id,Name,Gender,Category,Email,Mobile);
	
		return name;
	}
}
