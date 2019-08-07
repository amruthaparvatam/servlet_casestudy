package com.res.userdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.res.model.MyConnection;

public class DeleteDao {
	
	    MyConnection mc;
		
		Connection conn;
	
	public String deleteUserDetails(int id) {
		String name1=null;
		
		mc=new MyConnection();
		
		conn=mc.getMyConnection();

	
	try {
		//Step 3 : Create Statement
		Statement statement = conn.createStatement();
		//Step 4 : Execute Query
		String query = "delete from athlete where athlete_id="+id+"";
		int noOfRowsDeleted = statement.executeUpdate(query);
		System.out.println("Row deleted:"+noOfRowsDeleted);
		
		//Step 6 : close Connection
		statement.close();
		conn.close();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return name1;
}


}
