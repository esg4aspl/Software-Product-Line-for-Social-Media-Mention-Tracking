package com.iyte.thesisproject.domain;

import java.util.List;

import com.iyte.thesisproject.enums.Shoots;
import com.iyte.thesisproject.enums.VolleyballPosition;

public class VolleyballPlayer extends Player{

	private VolleyballPosition posiiton;
	private Shoots shoots;
	private int totalScores;

	public VolleyballPlayer(String name, List<SocialMediaAccount> accounts, double salary, int matchCount,
			int numberOfMatchWon, int numberOfMatchLost, VolleyballPosition posiiton, Shoots shoots, int totalScores) {
		super(name, accounts, salary, matchCount, numberOfMatchWon, numberOfMatchLost);
		this.posiiton = posiiton;
		this.shoots = shoots;
		this.totalScores = totalScores;
	}

	public VolleyballPosition getPosiiton() {
		return posiiton;
	}

	public void setPosiiton(VolleyballPosition posiiton) {
		this.posiiton = posiiton;
	}

	public Shoots getShoots() {
		return shoots;
	}

	public void setShoots(Shoots shoots) {
		this.shoots = shoots;
	}

	public int getTotalScores() {
		return totalScores;
	}

	public void setTotalScores(int totalScores) {
		this.totalScores = totalScores;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}	
	
}
