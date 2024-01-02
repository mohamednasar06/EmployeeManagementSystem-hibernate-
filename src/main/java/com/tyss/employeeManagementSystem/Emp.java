package com.tyss.employeeManagementSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp {
	@Id
	int eId;
	String name;
	double sal;
	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", name=" + name + ", sal=" + sal + "]";
	}
	public Emp(int eId, String name, double sal) {
		super();
		this.eId = eId;
		this.name = name;
		this.sal = sal;
	}
	public Emp() {
		super();
	}
	
	
	
	

}
