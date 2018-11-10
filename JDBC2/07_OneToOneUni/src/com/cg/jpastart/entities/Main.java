package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Address address = em.find(Address.class, 2);
		System.out.println(address.getStreet() + address.getCity()+address.getState() +address.getZipCode());
		Students students = em.find(Students.class, 9);
		System.out.println(students.getName()+students.getAddress().getCity()+students.getAddress().getState());
		
		
		em.close();
		factory.close();
		
		

	}

}
