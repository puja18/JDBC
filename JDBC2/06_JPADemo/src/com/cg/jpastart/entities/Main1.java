package com.cg.jpastart.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
	
		Query query = em.createQuery("from Student");
		List<Student> list = null;
		list = query.getResultList();
		for (Student student : list) {
		
		    String s = student.getName().toUpperCase();
		    student.setName(s);
			em.getTransaction().begin();
			em.merge(student); 
			em.getTransaction().commit(); 
			
		}
		em.close();
		factory.close();
		

	}

}
