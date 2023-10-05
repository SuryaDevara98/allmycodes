package com.te.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		try {
			String url = "jdbc:mysql://localhost:3307/my_courses";
			String username = "root";
			String password = "Prasanna@98";
			String tableName = "Course_details";
			String query = "CREATE TABLE " + tableName
					+ "(course_id int PRIMARI KEY AUTO INCREMENT,course_name varchar(15),trainee_name varchar(15),course_duration int)";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connection is established");
			Statement statement = con.createStatement();
			int rowsAffected = statement.executeUpdate(query);
			if (rowsAffected >= 0) {
				System.out.println("Table created with :" + tableName);
			}

		} catch (Exception e) {

		}
	}

}
