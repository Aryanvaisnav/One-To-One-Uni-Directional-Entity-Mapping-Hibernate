package com.jsp.vehicle.registeration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleRegistration {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Vehicle vehicle = new Vehicle();
		vehicle.setBrand("BMW");
		vehicle.setColor("Black");
		vehicle.setPrice(5200000.0);
		
		Registration registration = new Registration();
		registration.setRno(99975);
		registration.setCity("Mumbai");
		
		registration.setVehicle(vehicle);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(registration);
		entityTransaction.commit();
		

	}

}
