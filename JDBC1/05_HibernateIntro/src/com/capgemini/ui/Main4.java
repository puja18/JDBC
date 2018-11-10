package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.business.Employee;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Employee e =null;
		e = em.find(Employee.class,103);
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
