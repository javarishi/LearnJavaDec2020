package com.h2kinfosys.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	
	static String connectionURL = "jdbc:mysql://localhost:3306/sakila";
	static String userName = "root";
	static String password = "password";


	
	static Connection getConnection() throws Exception {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties info = new Properties();
			info.setProperty("user", userName);
			info.setProperty("password", password);
			conn = DriverManager.getConnection(connectionURL, info);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return conn;
	}

	
	static void closeConnection(Connection conn) {
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
