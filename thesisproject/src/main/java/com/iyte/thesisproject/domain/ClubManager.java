package com.iyte.thesisproject.domain;

import java.util.List;

public class ClubManager extends Person{

	private double salary;
	
	public ClubManager(String name, List<SocialMediaAccount> accounts, double salary) {
		super(name, accounts);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}
	
}
