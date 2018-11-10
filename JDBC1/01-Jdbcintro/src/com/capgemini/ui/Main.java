package com.capgemini.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.business.Customer;
import com.capgemini.db.CustomerDAO;
import com.capgemini.db.CustomerDAOImpl;

public class Main {
	public static void add() throws ClassNotFoundException, SQLException {
		int id = 0;
		String name = null;
		String city = null;
		double amt = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id:");
		 id = scanner.nextInt();
		System.out.println("Enter name: ");
        name = scanner.next();
        System.out.println("Enter city:");
        city = scanner.next();
        System.out.println("Enter amt:");
        amt = scanner.nextDouble();
        Customer customer = new Customer();
	    customer.setId(id);
	    customer.setName(name);
	    customer.setCity(city);
	    customer.setOutStandingAmount(amt);
	    CustomerDAO customerDAO = new CustomerDAOImpl();
	    boolean result = customerDAO.addCustomer(customer);
	    if(result = true) {
	    	System.out.println("Record added succesfully");
	    }
	    else {
	    	System.out.println("Not added");
	    }
		
	}
	public static void update() throws ClassNotFoundException, SQLException {
		int id = 0;
		String name = null;
		String city = null;
		double amt = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
        name = scanner.next();
        System.out.println("Enter city:");
        city = scanner.next();
        System.out.println("Enter amt:");
        amt = scanner.nextDouble();
        System.out.println("Enter id:");
		 id = scanner.nextInt();
        Customer customer = new Customer();
	    customer.setId(id);
	    customer.setName(name);
	    customer.setCity(city);
	    customer.setOutStandingAmount(amt);
	    CustomerDAO customerDAO = new CustomerDAOImpl();
	    boolean result = customerDAO.updateCustomer(customer);
	    if(result = true) {
	    	System.out.println("Record updated succesfully");
	    }
	    else {
	    	System.out.println("Not updated");
	    }
		
	}
	public static void display() throws ClassNotFoundException, SQLException {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		List<Customer> customers = customerDAO.getAllCustomers(); 
		//System.out.println(customers);
		for (Customer customer : customers) {
			System.out.print(customer.getId() + "\t");
			System.out.print(customer.getName() + "\t");
			System.out.print(customer.getCity() + "\t");
			System.out.println(customer.getOutStandingAmount() + "\t");
		}
		
	}
	public static void remove() throws ClassNotFoundException, SQLException {
		int inp_id = 0;
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter id to remove: ");
	    inp_id = scanner.nextInt();
	    
	    
	    
	    
	    CustomerDAO customerDAO = new CustomerDAOImpl();
	    boolean result = customerDAO.removeCustomer(inp_id);
	    if(result == true) {
	    	System.out.println("record deleted Succesfully");
	    }
	    else {
	    	System.out.println("not deleted");
	    }
	       
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Customer application");
		System.out.println("....................");
		System.out.println("1. Add New Customer");
		System.out.println("2. update Customer");
		System.out.println("3. Display All Customers");
		System.out.println("4. Delete Customer ");
		System.out.println("5. Exit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
			case 1:
				add();
			
				break;
			case 2:
				update();
				break;	

			case 3:
				display();
				break;
			case 4:
				remove();
				break;
			case 5:
				System.out.println("Thank you");
				break;	
		}
	}

}
