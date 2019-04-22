package com.iyte.thesisproject.domain;

import java.util.List;

import com.iyte.thesisproject.enums.Shoots;

public class BasketballPlayer extends Player{

	private BasketballPlayer posiiton;
	private Shoots foot;
	private int totalScores;
	private int totalAssists;
	private int totalRebounds;
	
	public BasketballPlayer(String name, List<SocialMediaAccount> accounts, double salary, int matchCount,
			int numberOfMatchWon, int numberOfMatchLost, BasketballPlayer posiiton, Shoots foot, int totalScores,
			int totalAssists, int totalRebounds) {
		super(name, accounts, salary, matchCount, numberOfMatchWon, numberOfMatchLost);
		this.posiiton = posiiton;
		this.foot = foot;
		this.totalScores = totalScores;
		this.totalAssists = totalAssists;
		this.totalRebounds = totalRebounds;
	}

	public BasketballPlayer getPosiiton() {
		return posiiton;
	}

	public void setPosiiton(BasketballPlayer posiiton) {
		this.posiiton = posiiton;
	}

	public Shoots getFoot() {
		return foot;
	}

	public void setFoot(Shoots foot) {
		this.foot = foot;
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

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
