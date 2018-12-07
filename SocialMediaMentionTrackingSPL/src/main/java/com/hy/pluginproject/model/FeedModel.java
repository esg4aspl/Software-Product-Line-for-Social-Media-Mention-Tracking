package com.hy.pluginproject.model;

import java.util.Date;

public class FeedModel {

	private String link;
    private String title;
    private Date publishedDate;
    
	public FeedModel() {

	}
    
	public FeedModel(String link, String title, Date publishedDate) {
		this.link = link;
		this.title = title;
		this.publishedDate = publishedDate;
	}
    
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	
}
