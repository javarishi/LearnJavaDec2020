package com.h2kinfosys.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import com.mysql.cj.jdbc.Driver;

public class JDBCConnection {
	
	static String connectionURL = "jdbc:mysql://localhost:3306/sakila";
	static String userName = "root";
	static String password = "password";
	static String sqlQuery = "Select * from Actor";

	public static void main(String[] args) throws SQLException {
		// Step 1 - Initialize Driver
		Connection connection = null;
		try {
			Driver driver = new Driver();
			// Step 2 - Register this Driver with us
			DriverManager.registerDriver(driver);
			// Step 3 - Create a Connection
			connection = DriverManager.getConnection(connectionURL, userName, password);
			// Step 4 - Statement
			Statement stat = connection.createStatement();
			ResultSet rs = stat.executeQuery(sqlQuery);
			// Step 5 - Manage ResultSet
			if(rs != null) {
				String firstName = null;
				String lastName = null;
				Timestamp lastUpdate = null;
				while(rs.next()) {
					int actorId = rs.getInt("actor_id");
					firstName = rs.getString("first_name");
					lastName = rs.getString("last_name");
					lastUpdate = rs.getTimestamp("last_update");
					System.out.println(actorId + " " + firstName + "  " + lastName + " " + lastUpdate);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}

	}

}
