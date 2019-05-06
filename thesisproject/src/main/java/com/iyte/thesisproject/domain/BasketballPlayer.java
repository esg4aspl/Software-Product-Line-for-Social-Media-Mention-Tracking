package com.iyte.thesisproject.domain;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BasketballPlayers")
public class BasketballPlayer extends Player{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public ObjectId _id;
	
	private BasketballPlayer positon;
	private int totalScores;
	private int totalAssists;
	private int totalRebounds;
	
	public BasketballPlayer(ObjectId _id, String name, String nationality, int age, double salary, 
							int matchCount, int numberOfMatchWon, int numberOfMatchLost, 
							BasketballPlayer positon, int totalScores, int totalAssists, int totalRebounds) {
		
		super(name, age, nationality, salary, matchCount, numberOfMatchWon, numberOfMatchLost);
		this._id = _id;
		this.positon = positon;
		this.totalScores = totalScores;
		this.totalAssists = totalAssists;
		this.totalRebounds = totalRebounds;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
	public BasketballPlayer getPositon() {
		return positon;
	}

	public void setPositon(BasketballPlayer positon) {
		this.positon = positon;
	}

	public int getTotalScores() {
		return totalScores;
	}

	public void setTotalScores(int totalScores) {
		this.totalScores = totalScores;
	}

	public int getTotalAssists() {
		return totalAssists;
	}

	public void setTotalAssists(int totalAssists) {
		this.totalAssists = totalAssists;
	}

	public int getTotalRebounds() {
		return totalRebounds;
	}

	public void setTotalRebounds(int totalRebounds) {
		this.totalRebounds = totalRebounds;
	}
	
}
