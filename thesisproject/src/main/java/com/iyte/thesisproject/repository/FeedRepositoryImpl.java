package com.iyte.thesisproject.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;

import com.iyte.thesisproject.domain.Feed;

public class FeedRepositoryImpl implements FeedRepositoryCustom{
	
	@Autowired
    MongoTemplate mongoTemplate;

	@Override
	public List<Feed> getFeedsBySearchedName(String name) {
		
		BasicQuery query1 = new BasicQuery("{ $text: { $search: \"  "+ name + "\" } }");
		
		//BasicQuery query1 = new BasicQuery("{ $text: { $search: \"\\\"Fatih Terim\\\"\" } }");
		
		List<Feed> feeds = mongoTemplate.find(query1, Feed.class);
		
		return feeds;
	}
	
	

}
