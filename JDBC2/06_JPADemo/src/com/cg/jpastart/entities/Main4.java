package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
					Trip trip=null;
					trip=em.find(Trip.class, 1);
					
					System.out.println(trip);
					System.out.println(trip.getInfo()); 
			 


	}

}
