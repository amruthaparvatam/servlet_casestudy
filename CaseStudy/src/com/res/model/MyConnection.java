package com.res.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	  Connection conn;
	
		public Connection getMyConnection() {
			
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			
				conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","dairy100");
				
			}  catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
			
		}

}
