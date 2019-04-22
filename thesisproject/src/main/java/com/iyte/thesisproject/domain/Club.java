package com.iyte.thesisproject.domain;

import java.util.Date;
import java.util.List;

import com.iyte.thesisproject.enums.Branch;

public class Club extends SocialMediaOwner{

	private Date foundationYear;
	private int totalChanpionshipCount;
	private Branch branch;
	private List<Person> members;
	
	public Club(String name, List<SocialMediaAccount> accounts, Date foundationYear, int totalChanpionshipCount,
			Branch branch, List<Person> members) {
		super(name, accounts);
		this.foundationYear = foundationYear;
		this.totalChanpionshipCount = totalChanpionshipCount;
		this.branch = branch;
		this.members = members;
	}

	public Date getFoundationYear() {
		return foundationYear;
	}

	public void setFoundationYear(Date foundationYear) {
		this.foundationYear = foundationYear;
	}

	public int getTotalChanpionshipCount() {
		return totalChanpionshipCount;
	}

	public void setTotalChanpionshipCount(int totalChanpionshipCount) {
		this.totalChanpionshipCount = totalChanpionshipCount;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public List<Person> getMembers() {
		return members;
	}

	public void setMembers(List<Person> members) {
		this.members = members;
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}
	
	

}
