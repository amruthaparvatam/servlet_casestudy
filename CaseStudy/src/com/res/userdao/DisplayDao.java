package com.res.userdao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.res.model.Athelete;
import com.res.model.MyConnection;

public class DisplayDao {
	
    MyConnection mc;
	
	Connection conn;
	
	public ArrayList displayUserDetails(){
		
		ArrayList<Athelete> athelets = new ArrayList<Athelete>();
		
		mc=new MyConnection();
		conn=mc.getMyConnection();
		
		try {
			
			Statement statement = conn.createStatement();
			
			String query = "select * from athlete";
			
			ResultSet resultSet = statement.executeQuery(query);
			System.out.println(resultSet);
			
			Athelete ath = null;
			
			while(resultSet.next()){
				ath = new Athelete();
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String gender= resultSet.getString(3);
				String category = resultSet.getString(4);
				String email = resultSet.getString(5);
				int mobile = resultSet.getInt(6);
				
				ath.setId(id);
				ath.setName(name);
				ath.setGender(gender);
				ath.setCategory(category);
				ath.setEmail(email);
				ath.setMobile(mobile);
				
				athelets.add(ath);
			}
			//System.out.println("size :  " +athelets.size());
			
			statement.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return athelets;
	}

}
