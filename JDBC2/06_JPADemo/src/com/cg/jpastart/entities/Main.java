package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Student student = null;
		student = em.find(Student.class, 7);
		student.setName("suma");
		em.getTransaction().begin();
		em.merge(student); 
		em.getTransaction().commit(); 
		System.out.println("Added one student to database.");
		em.close();
		factory.close();
		
	}

}
