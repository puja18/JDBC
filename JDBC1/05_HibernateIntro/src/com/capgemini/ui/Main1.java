package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.business.Employee;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Employee e = null;
		
		e = em.find(Employee.class, 102);
		
	
		em.close();
		emf.close();
		System.out.println(e);

	}

}
