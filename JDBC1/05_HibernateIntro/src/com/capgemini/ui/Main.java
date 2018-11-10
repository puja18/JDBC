package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.capgemini.business.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		Employee employee = new Employee();
		employee.setEmpId(102);
		employee.setEmpName("puja");
		employee.setBasicSalary(20000.0);
		employee.setEmpGender('F');
		employee.setEmpGrade('A');
		
		
		
		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(employee);
		
		t.commit();
		em.close();
		emf.close();
		System.out.println("Object is stored in db");

	}

}
