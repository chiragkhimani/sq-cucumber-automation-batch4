package com.automation.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	static Connection con;

	public static void main(String[] args) throws Exception {
		// 1. Register driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Open the connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bootcamp", "root", "Trust@123");

		// 3. Query the database
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("select first_name from employees;");

		// 4. Print the result into console
		while (result.next()) {
			System.out.print(result.getString("first_name") + " ");
		}
	}

}
