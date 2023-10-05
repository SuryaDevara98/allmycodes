package com.te.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class SuperVillainsApp {
	public static void main(String[] args) {

		SuperVillains supervillains = new SuperVillains("devara", " ", 53697);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(supervillains);
		transaction.commit();
		session.close();

	}
}
