package com.te.jpawithservelet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Employee employee2 = new Employee(15, "Surya", 24);
		Employee employee1 = new Employee(14, "devara", 24);
		Employee employee = new Employee();

		employee.setEmpId(100);
		employee.setEmpName("Surya");
		employee.setEmpAge(24);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeedata");

		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(employee2);
		manager.persist(employee);
		manager.getTransaction().commit();
		manager.close();

	}
}
