package com.te.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentMain {

	public static void main(String[] args) {

		Students st = new Students();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Hostels");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Scanner scanner = new Scanner(System.in);

		System.out.println("enertr id");
		Students stu = manager.find(Students.class, scanner.nextInt());
		stu.setLastName("prasannakumar");
		manager.persist(stu);
		manager.getTransaction().commit();
		manager.close();

	}

}
