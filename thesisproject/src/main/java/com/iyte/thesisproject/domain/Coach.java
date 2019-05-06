package com.iyte.thesisproject.domain;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Coaches")
public class Coach extends TrackedMember{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public ObjectId _id;
	
	private Club club;
	private int age;
	private double salary;
	private int matchCount;
	private int numberOfMatchWon;
	private int numberOfMatchDraw;
	private int numberOfMatchLost;

	public Coach(ObjectId _id, String name, int age, String nationality, Club club, double salary, int matchCount, int numberOfMatchWon, int numberOfMatchDraw, int numberOfMatchLost) {
		
		super(name, nationality);
		this._id = _id;
		this.age = age;
		this.club = club;
		this.salary = salary;
		this.matchCount = matchCount;
		this.numberOfMatchWon = numberOfMatchWon;
		this.numberOfMatchDraw = numberOfMatchDraw;
		this.numberOfMatchLost = numberOfMatchLost;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public int getNumberOfMatchDraw() {
		return numberOfMatchDraw;
	}

	public void setNumberOfMatchDraw(int numberOfMatchDraw) {
		this.numberOfMatchDraw = numberOfMatchDraw;
	}

	public int getNumberOfMatchLost() {
		return numberOfMatchLost;
	}

	public void setNumberOfMatchLost(int numberOfMatchLost) {
		this.numberOfMatchLost = numberOfMatchLost;
	}

	/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	*/
	
	@Override
	public String toString() {
		return "Coach [_id=" + _id + ", club=" + club + ", salary=" + salary + ", matchCount=" + matchCount
				+ ", numberOfMatchWon=" + numberOfMatchWon + ", numberOfMatchDraw=" + numberOfMatchDraw
				+ ", numberOfMatchLost=" + numberOfMatchLost + "]";
	}

}
