package com.capgemini.business;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Contact {
	@Id
	int id;
	String name;
	String phoneNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Contact(int id, String name, String phoneNum) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	public Contact() {
		super();
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phoneNum="
				+ phoneNum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
 
}
