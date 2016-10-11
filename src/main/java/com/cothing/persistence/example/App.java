package com.cothing.persistence.example;

import javax.persistence.EntityManager;

import com.cothing.persistence.example.inject.PersistenceModule;
import com.cothing.persistence.example.service.MyService;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App {
	@Inject private MyService service;
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Injector injector = Guice.createInjector(new PersistenceModule("jpa-example"));
		injector.injectMembers(new App());
		App app = injector.getInstance(App.class);
		app.service.createNewPerson();
		System.out.println("Hehe!");
			/*
	    Person person = new Person();
	    person.setName("xiao8");

	    EntityManager em = PersistenceManager.INSTANCE.getEntityManager();

	    em.getTransaction()

	        .begin();

	    em.persist(person);

	    em.getTransaction()

	        .commit();

	    em.close();

	    PersistenceManager.INSTANCE.close();*/
		
	}

}
