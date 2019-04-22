package com.iyte.thesisproject.domain;

public class SocialMediaAccount {

	private String username;
	private int followerCount;
	
	public SocialMediaAccount(String username, int followerCount) {
		this.username = username;
		this.followerCount = followerCount;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getFollowerCount() {
		return followerCount;
	}

	public void setFollowerCount(int followerCount) {
		this.followerCount = followerCount;
	}
	
	
	
}
