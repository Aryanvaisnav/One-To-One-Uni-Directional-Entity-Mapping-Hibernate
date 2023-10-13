package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		// Create Person Object
		
		Person person = new Person();
		person.setName("ABC");
		person.setEmail("abc@gmail.com");
		person.setCno(537346372888l);
		
		// Create Pan Object
		
		Pan pan = new Pan();
		pan.setAddress("Mumbai");
		
		// Setting pan with the specified person
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		

	}

}
