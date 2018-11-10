package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeatInfo info = new SeatInfo(30,20,10);
		Trip trip = new Trip();
		trip.setFromCity("Chennai");
		trip.setToCity("Hyderabad");
		trip.setInfo(info);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(trip);
		em.getTransaction().commit();
        em.close();
        factory.close();
	}

}
