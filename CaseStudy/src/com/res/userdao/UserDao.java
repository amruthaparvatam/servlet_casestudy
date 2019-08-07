package com.res.userdao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.res.model.MyConnection;

public class UserDao {
	
	MyConnection mc;
	
	Connection conn;

	public String addUserDetails(int id, String name, String gender, String category, String email, int mobile) {
			String name1=null;
			
			mc=new MyConnection();
			conn=mc.getMyConnection();
		
		try {
		
			Statement statement = conn.createStatement();
			
			String query = "insert into athlete values("+id+",'"+name+"','"+gender+"','"+category+"','"+email+"',"+mobile+")";
			
			int noOfRowsInserted = statement.executeUpdate(query);
			
			System.out.println("Rows inserted:"+noOfRowsInserted);
			
			
			statement.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name1;
	}

	

}
