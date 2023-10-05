package com.te.sampleservelet;

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

@WebServlet("/EmployeeData")
public class EmployeeData extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			String employee_id = req.getParameter("id");
			int id = Integer.parseInt(employee_id);

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tecm18";
			String usernmae = "root";
			String password = "Prasanna@98";
			String query = "SELECT * FROM tecm18.empinfo where EmpId=?; ";
			Connection con = DriverManager.getConnection(url, usernmae, password);
			PreparedStatement state = con.prepareStatement(query);

			state.setInt(1, id);
//			PrintWriter writer = resp.getWriter();
//			writer.println("hello");

			ResultSet rest = state.executeQuery();
			while (rest.next()) {
				int id1 = rest.getInt(1);
				String id2 = rest.getString(2);
				int id3 = rest.getInt(3);
				int id4 = rest.getInt(4);

				PrintWriter writer1 = resp.getWriter();
				writer1.println(id1 + "---" + id2 + "----" + id3 + "----" + id4);

			}

		} catch (Exception e) {

		}
	}

}
