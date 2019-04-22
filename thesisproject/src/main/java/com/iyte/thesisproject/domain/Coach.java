package com.iyte.thesisproject.domain;

import java.util.List;

public class Coach extends Person{

	private double salary;
	private int matchCount;
	private int numberOfMatchWon;
	private int numberOfMatchLost;

	public Coach(String name, List<SocialMediaAccount> accounts, double salary, int matchCount, int numberOfMatchWon, int numberOfMatchLost) {
		super(name, accounts);
		this.salary = salary;
		this.matchCount = matchCount;
		this.numberOfMatchWon = numberOfMatchWon;
		this.numberOfMatchLost = numberOfMatchLost;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getMatchCount() {
		return matchCount;
	}

	public void setMatchCount(int matchCount) {
		this.matchCount = matchCount;
	}

	public int getNumberOfMatchWon() {
		return numberOfMatchWon;
	}

	public void setNumberOfMatchWon(int numberOfMatchWon) {
		this.numberOfMatchWon = numberOfMatchWon;
	}

	public int getNumberOfMatchLost() {
		return numberOfMatchLost;
	}

	public void setNumberOfMatchLost(int numberOfMatchLost) {
		this.numberOfMatchLost = numberOfMatchLost;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
