package com.iyte.thesisproject.domain;

import java.util.List;


public class Player extends TrackedMember{

	private int age;
	private double salary;
	private int matchCount;
	private int numberOfMatchWon;
	private int numberOfMatchLost;
	
	public Player() {

	}
	
	public Player(String name, int age, String nationality, double salary, int matchCount, int numberOfMatchWon, int numberOfMatchLost) {
		
		super(name, nationality);
		this.age = age;
		this.salary = salary;
		this.matchCount = matchCount;
		this.numberOfMatchWon = numberOfMatchWon;
		this.numberOfMatchLost = numberOfMatchLost;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
	
}
