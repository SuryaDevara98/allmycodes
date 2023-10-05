package com.te.jpawithhibernatemanytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class WifiAppMain {

	public static void main(String[] args) {

		WifiRouters router1stFloor = new WifiRouters();
		router1stFloor.setRouterId(101);
		router1stFloor.setModel("DLink");
		router1stFloor.setService("Airtel");
		router1stFloor.setSpeed(100);

		WifiRouters router2ndFloor = new WifiRouters();
		router2ndFloor.setRouterId(201);
		router2ndFloor.setModel("TP- Link");
		router2ndFloor.setService("Jio");
		router2ndFloor.setSpeed(50);

		WifiUsers user1 = new WifiUsers();
		user1.setIpAddress(111);
		user1.setDevices(3);
		user1.setDeviceName("laptop,mobile,iPad");
		user1.setUserName("Donald.matta");

		WifiUsers user2 = new WifiUsers();
		user2.setIpAddress(222);
		user2.setDevices(2);
		user2.setDeviceName("laptop,mobile");
		user2.setUserName("Prudhvi.tripuraneni");

		WifiUsers user3 = new WifiUsers();
		user3.setIpAddress(420);
		user3.setDevices(2);
		user3.setDeviceName("laptop,iPhone");
		user3.setUserName("Illiaz.konda");

		WifiUsers user4 = new WifiUsers();
		user4.setIpAddress(840);
		user4.setDevices(5);
		user4.setDeviceName("mylaptop,myiPhone,Rohit's laptop,Rohit's Phone, smart_tv");
		user4.setUserName("Tanzeer.Rohit");

		List<WifiRouters> routerList = new ArrayList<WifiRouters>();
		routerList.add(router1stFloor);
		routerList.add(router2ndFloor);

		List<WifiUsers> userList = new ArrayList<WifiUsers>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);

		router1stFloor.setUsers(userList);
		user1.setRouters(routerList);
		user2.setRouters(routerList);
		user4.setRouters(routerList);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hostels");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(em);
		em.persist(router1stFloor);
		em.persist(router2ndFloor);
		em.persist(user1);
		em.persist(user2);
		em.persist(user3);
		em.persist(user4);
		em.getTransaction().commit();
		em.close();
	}

}
