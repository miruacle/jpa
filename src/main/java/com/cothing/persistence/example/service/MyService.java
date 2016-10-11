package com.cothing.persistence.example.service;

import javax.persistence.EntityManager;

import com.cothing.persistence.example.Person;
import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

public class MyService {

	@Inject EntityManager em;
	
	@Transactional
	public void createNewPerson(){
		em.persist(new Person("430"));
	}
}
