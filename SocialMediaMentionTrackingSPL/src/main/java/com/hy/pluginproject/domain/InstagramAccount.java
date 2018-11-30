package com.hy.pluginproject.domain;

public class InstagramAccount extends SocialMediaAccount{

	private int likeCount;
	private int commentCount;

	public InstagramAccount(String username, int followerCount, int likeCount, int commentCount) {
		super(username, followerCount);
		this.likeCount = likeCount;
		this.commentCount = commentCount;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	
}
