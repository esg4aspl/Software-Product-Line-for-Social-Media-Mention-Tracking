package com.iyte.thesisproject.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VolleyballPlayers")
public class VolleyballPlayer extends Player{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public ObjectId _id;
	
	private int totalScores;

	public VolleyballPlayer(ObjectId _id, String name, String nationality, int age, double salary, int matchCount, int numberOfMatchWon, int numberOfMatchLost, int totalScores) {
		
		super(name, age, nationality, salary, matchCount, numberOfMatchWon, numberOfMatchLost);
		this._id = _id;
		this.totalScores = totalScores;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
	public int getTotalScores() {
		return totalScores;
	}

	public void setTotalScores(int totalScores) {
		this.totalScores = totalScores;
	}

}
