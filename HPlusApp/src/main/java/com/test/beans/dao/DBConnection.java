package com.test.beans.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnectionToDB() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySQL JDBC Drivte Get Registered...!");

			connection = DriverManager.getConnection("jdbc.mysql://localhost:3306/hplus", "root", "root");

		} catch (ClassNotFoundException e) {
			System.out.println("Where is My sql JDBC Driver?");
			e.printStackTrace();

		}
		catch (SQLException e) {
			System.out.println("Connection Failed.....! Check Console");
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("Connection made to DB");
		}
		return connection;
	}
}
