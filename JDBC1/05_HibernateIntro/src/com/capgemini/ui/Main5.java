package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.business.Contact;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact contact1 = new Contact(101, "puja", "6302088199");
		Contact contact2 = new Contact(102, "Bhagi", "9550608053");
		Contact contact3 = new Contact(103, "santhu", "9505815715");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
	    /*em.persist(contact);
		em.persist(contact1);
		em.persist(contact2);*/
		
		contact3.setPhoneNum("9505815715");
		em.merge(contact3);
		em.close();
		emf.close();
		Contact contact4 = null;
		
		emf = Persistence.createEntityManagerFactory("JPA-PU");
		em = emf.createEntityManager();
		em.getTransaction().begin();
		contact4 = em.find(Contact.class, 103);
		contact4.setPhoneNum("9550077613");
		em.merge(contact4);
		System.out.println(contact4.equals(contact3));
		em.getTransaction().commit();

	}

}
