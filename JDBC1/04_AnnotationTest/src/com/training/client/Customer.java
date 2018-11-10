package com.training.client;
@Table(name = "Customer")
@Entity
public class Customer {
	@Id
	int id;
	@Column(name = "c_name", notNull = true, size = 25)
	String name;
	@Column(name = "c_city", notNull = true, size = 20)
	String city;
	double outStandingAmount;

}
