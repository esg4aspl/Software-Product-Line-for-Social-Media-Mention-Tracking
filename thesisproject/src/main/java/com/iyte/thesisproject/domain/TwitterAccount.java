package com.iyte.thesisproject.domain;

public class TwitterAccount extends SocialMediaAccount{

	private String tweetCount;
	private int retweetCount;
	
	public TwitterAccount(String username, int followerCount, String tweetCount, int retweetCount) {
		super(username, followerCount);
		this.tweetCount = tweetCount;
		this.retweetCount = retweetCount;
	}

	public String getTweetCount() {
		return tweetCount;
	}

	public void setTweetCount(String tweetCount) {
		this.tweetCount = tweetCount;
	}

	public int getRetweetCount() {
		return retweetCount;
	}

	public void setRetweetCount(int retweetCount) {
		this.retweetCount = retweetCount;
	}
	


}
