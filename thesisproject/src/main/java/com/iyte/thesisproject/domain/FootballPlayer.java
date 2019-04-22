package com.iyte.thesisproject.domain;

import java.util.List;

import com.iyte.thesisproject.enums.Foot;
import com.iyte.thesisproject.enums.FootballPosition;

public class FootballPlayer extends Player{

	private FootballPosition posiiton;
	private Foot foot;
	private int totalGoal;
	private int totalAssist;
	
	public FootballPlayer(String name, List<SocialMediaAccount> accounts, double salary, int matchCount,
			int numberOfMatchWon, int numberOfMatchLost, FootballPosition posiiton, Foot foot, int totalGoal,
			int totalAssist) {
		super(name, accounts, salary, matchCount, numberOfMatchWon, numberOfMatchLost);
		this.posiiton = posiiton;
		this.foot = foot;
		this.totalGoal = totalGoal;
		this.totalAssist = totalAssist;
	}

	public FootballPosition getPosiiton() {
		return posiiton;
	}

	public void setPosiiton(FootballPosition posiiton) {
		this.posiiton = posiiton;
	}

	public Foot getFoot() {
		return foot;
	}

	public void setFoot(Foot foot) {
		this.foot = foot;
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

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
