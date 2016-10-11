package com.cothing.persistence.example;

import javax.persistence.EntityManager;
/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		/*
	    Address address = new Address();

	    address.setCity("Dhaka")

	        .setCountry("Bangladesh")

	        .setPostcode("1000")

	        .setStreet("Poribagh");*/
	    Person person = new Person();
	    person.setName("xiao8");

	    EntityManager em = PersistenceManager.INSTANCE.getEntityManager();

	    em.getTransaction()

	        .begin();

	    em.persist(person);

	    em.getTransaction()

	        .commit();

	    em.close();

	    PersistenceManager.INSTANCE.close();
	}
}
