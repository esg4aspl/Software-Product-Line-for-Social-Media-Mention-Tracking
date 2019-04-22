package com.iyte.thesisproject.domain;

public class FacebookAccount extends SocialMediaAccount{

	private int likeCount;
	private int postCount;
	
	public FacebookAccount(String username, int followerCount, int likeCount, int postCount) {
		super(username, followerCount);
		this.likeCount = likeCount;
		this.postCount = postCount;
	}
	
	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getPostCount() {
		return postCount;
	}

	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}

	

}
