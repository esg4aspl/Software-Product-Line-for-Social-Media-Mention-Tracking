package com.iyte.thesisproject.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ClubManagers")
public class ClubManager extends TrackedMember{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public ObjectId _id;
		
	private int age;
	
	private Club club;

	public ClubManager(ObjectId _id, String name, String nationality, int age, Club club) {
		
		super(name, nationality);
		this._id = _id;
		this.age = age;
		this.club = club;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	
	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
}
