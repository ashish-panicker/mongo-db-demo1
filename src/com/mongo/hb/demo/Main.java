package com.mongo.hb.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.jboss.logging.Logger;

public class Main {

	private static EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {

		entityManagerFactory = HibernateOGMUtil.getEntityManagerFactory();

		EntityManager em = entityManagerFactory.createEntityManager();
		
		Model obj1 = new Model();
		obj1.setName("Ashish");
		
		Model obj2 = new Model();
		obj2.setName("Rahul");
		
		
		em.getTransaction().begin();
		
		em.persist(obj1);
		em.persist(obj2);
		
		em.getTransaction().commit();
		
		System.out.println("Persistence complete...");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*
		 * Breed collie = new Breed(); collie.setName("Collie");
		 * 
		 * Dog dina = new Dog(); dina.setName("Dina"); dina.setBreed(collie);
		 * 
		 * em.getTransaction().begin();
		 * 
		 * em.persist(collie); em.persist(dina);
		 * 
		 * em.getTransaction().commit();
		 */

	}

}
