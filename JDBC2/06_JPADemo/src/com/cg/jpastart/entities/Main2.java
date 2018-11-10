package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Student student = null;
		em.getTransaction().begin();
		student = em.find(Student.class, 4);
		em.remove(student); 
		em.getTransaction().commit(); 
		System.out.println("Removed one student from database.");
		em.close();
		factory.close();
		
		

	}

}
