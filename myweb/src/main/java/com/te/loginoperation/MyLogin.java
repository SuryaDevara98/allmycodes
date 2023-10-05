package com.te.loginoperation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyLogin")
public class MyLogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String rollNo = req.getParameter("rollno");
		int roll = Integer.parseInt(rollNo);

		String password2 = null;
		String name = null;

		String password1 = req.getParameter("password");
		PrintWriter writer1 = resp.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tecm21";
			String usernmae = "root";
			String password = "Prasanna@98";
			String query = "SELECT * FROM tecm21.registrationform where RollNo=?;";
			Connection con = DriverManager.getConnection(url, usernmae, password);
			PreparedStatement state = con.prepareStatement(query);
			state.setInt(1, roll);

			ResultSet result = state.executeQuery();

			while (result.next()) {
				int rollNumber = result.getInt("RollNo");
				password2 = result.getString("Password");
				name = result.getString("FirstName");

			}
			if (password1.equals(password2)) {

				writer1.println("Hello Mr. " + name + " welcome back ");
				writer1.print("<br>");
				writer1.print("mass ooora mass");

			} else {
				writer1.println("You have entered incorrect rollNo/passsword");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
