package com.res.userservice;

import com.res.userdao.DeleteDao;
import com.res.userdao.UpdateDao;

public class UpdateService {
	
UpdateDao updateDao;
	
	public UpdateService() {
		
		updateDao = new UpdateDao();

	}

	public String updateUserDetails(int Id,int Mobile) {
		
		String name = updateDao.updateUserDetails(Id,Mobile);
	
		return name;
	}

}
