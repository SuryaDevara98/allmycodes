package com.te.sampleservelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentDetails")
public class StudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String tr_id = req.getParameter("tr_id");
		int id = Integer.parseInt(tr_id);

		String tr_name = req.getParameter("tr_name");

		String tr_age = req.getParameter("tr_age");
		int age = Integer.parseInt(tr_age);

		String tr_city = req.getParameter("tr_city");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tecm18";
			String usernmae = "root";
			String password = "Prasanna@98";
			String query = "insert into tecm18.details values(?,?,?,?)";
			Connection con = DriverManager.getConnection(url, usernmae, password);
			PreparedStatement state = con.prepareStatement(query);
			state.setInt(1, id);
			state.setString(2, tr_name);
			state.setInt(3, age);
			state.setString(4, tr_city);
			int in = state.executeUpdate();

			PrintWriter writer = res.getWriter();
			writer.print(" mr ." + tr_name + " your data added successfully ");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
