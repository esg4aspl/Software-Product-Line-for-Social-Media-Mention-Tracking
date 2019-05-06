package com.iyte.thesisproject.domain;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FootballPlayers")
public class FootballPlayer extends Player{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public ObjectId _id;
		
	private int totalGoal;
	private int totalAssist;

	public FootballPlayer(ObjectId _id, String name, String nationality, 
						  int age, double salary, int matchCount, int numberOfMatchWon, 
						  int numberOfMatchLost, int totalGoal, int totalAssist) {
		
		super(name, age, nationality, salary, matchCount, numberOfMatchWon, numberOfMatchLost);
		
		this._id = _id;
		this.totalGoal = totalGoal;
		this.totalAssist = totalAssist;
	}
	
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public int getTotalGoal() {
		return totalGoal;
	}

	public void setTotalGoal(int totalGoal) {
		this.totalGoal = totalGoal;
	}

	public int getTotalAssist() {
		return totalAssist;
	}

	public void setTotalAssist(int totalAssist) {
		this.totalAssist = totalAssist;
	}
	
}
