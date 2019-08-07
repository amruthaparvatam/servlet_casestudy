package com.res.userservice;


import java.util.ArrayList;

import com.res.userdao.DisplayDao;
import com.res.userdao.UserDao;

public class DisplayService {
	
	DisplayDao displayDao;
	
	public DisplayService() {
		
	    displayDao = new DisplayDao();
	}
	
    public ArrayList displayUserDetails() {
		
		return displayDao.displayUserDetails();
	
	}

}
