package com.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtils {

	static Connection con;

	public static void initDatabase() {

		try {
			// 1. Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Open the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bootcamp", "root", "Trust@123");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static ResultSet getData(String query) throws SQLException {
		// 3. Query the database
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(query);

		// 4. Return result
		return result;

	}
}
