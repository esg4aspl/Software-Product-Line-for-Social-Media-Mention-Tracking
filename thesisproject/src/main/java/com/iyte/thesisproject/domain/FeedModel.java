package com.iyte.thesisproject.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import org.bson.types.ObjectId;

@Document(collection = "RSSFeeds")
public class FeedModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public ObjectId _id;	
	
	private String Title;
	private String Link;
	private Date PubDate;
	private String Description;

	public FeedModel() {

	}

	public FeedModel(ObjectId _id, String Title, String Link, Date PubDate, String Description) {
		this._id = _id;
		this.Link = Link;
		this.Title = Title;
		this.PubDate = PubDate;
		this.Description = Description;
	}
	
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String Link) {
		this.Link = Link;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public Date getPubDate() {
		return PubDate;
	}

	public void setPubDate(Date PubDate) {
		this.PubDate = PubDate;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "FeedModel [_id=" + _id + ", Title=" + Title + ", Link=" + Link + ", PubDate=" + PubDate
				+ ", Description=" + Description + "]";
	}
	
	
	
}
