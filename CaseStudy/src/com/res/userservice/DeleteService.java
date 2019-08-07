package com.res.userservice;

import com.res.userdao.DeleteDao;
import com.res.userdao.UserDao;

public class DeleteService {
	
	DeleteDao deleteDao;
	
	public DeleteService() {
		
		deleteDao = new DeleteDao();

	}

	public String deleteUserDetails(int Id) {
		
		String name = deleteDao.deleteUserDetails(Id);
	
		return name;
	}
}
