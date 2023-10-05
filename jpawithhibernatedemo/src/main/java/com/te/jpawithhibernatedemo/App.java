package com.te.jpawithhibernatedemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hostels");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		Tenants tent1 = new Tenants();
		Tenants tent2 = new Tenants();
		Room room101 = new Room();
		tent1.setAadharNumber(98765);
		tent1.setGender("Male");
		tent1.setName("Mr. surya");
		tent1.setMob(987654321);
		tent1.setRoom(room101);
//
		tent2.setAadharNumber(23454);
		tent2.setGender("Male");
		tent2.setName("dvara");
		tent2.setMob(768234980);
		tent2.setRoom(room101);
//
		List<Tenants> tenantList = new ArrayList<Tenants>();
		tenantList.add(tent2);
		tenantList.add(tent1);
//
		room101.setRoomNumber(102);
		room101.setAc("Voltas");
		room101.setLights(0);
		room101.setBeds("King Size");
		room101.setTenants(tenantList);

		em.getTransaction().begin();
		em.persist(room101);
		em.persist(tent1);
		em.persist(tent2);
		// System.out.println(em.find(Tenants.class, tent1.getAadharNumber()));
		em.getTransaction().commit();
		System.out.println("----------------");
		// get(987654321);
		em.close();

	}

//	public static void get(int a) {
//		Tenants s = em.find(Tenants.class, a);
//		System.out.println(s);
//		em.close();
//	}
}
