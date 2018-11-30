package com.hy.pluginproject.domain;

import java.util.List;

public abstract class Person extends SocialMediaOwner{

	private double height;
	private double weight;
	private int age;
	private String nationality;
	
	public Person(String name, List<SocialMediaAccount> accounts) {
		super(name, accounts);
		// TODO Auto-generated constructor stub
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
