package com.te.sampleserveletwithjpa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/Employees" })
public class Employees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String empId = request.getParameter("id");
//	String empName=	request.getParameter("name");
//	String empAge=	request.getParameter("age");
		// request.getwriter();

		// String[] emp = request.getParameterValues(empId);

//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
//
//		EntityManager manager = emf.createEntityManager();
//		manager.getTransaction().begin();
//		// manager.find(Employee.class, manager);
//		manager.getTransaction().commit();
//		manager.close();

	}

}
