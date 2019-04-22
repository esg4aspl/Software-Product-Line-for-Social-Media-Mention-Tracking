package com.iyte.thesisproject.domain;

import java.util.List;

public abstract class SocialMediaOwner {

	private String name;
	private List<SocialMediaAccount> accounts;
	
	public SocialMediaOwner(String name, List<SocialMediaAccount> accounts) {
		this.name = name;
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SocialMediaAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<SocialMediaAccount> accounts) {
		this.accounts = accounts;
	}
	
	public abstract void getInfo();
	
}
