package com.technoelevate.superheros;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;

	public static Connection provideConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tecm18?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "Prasanna@98";
			Connection con = DriverManager.getConnection(url, username, password);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return con;
		}

	}

}
