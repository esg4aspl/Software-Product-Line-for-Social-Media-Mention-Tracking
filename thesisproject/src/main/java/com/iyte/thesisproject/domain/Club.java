package com.iyte.thesisproject.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Clubs")
public class Club extends TrackedMember{
	
	private Date foundationYear;
	private int totalChanpionshipCount;
	
	public Club(String name, String nationality, Date foundationYear, int totalChanpionshipCount) {
		
		super(name, nationality);
		this.foundationYear = foundationYear;
		this.totalChanpionshipCount = totalChanpionshipCount;
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

}
