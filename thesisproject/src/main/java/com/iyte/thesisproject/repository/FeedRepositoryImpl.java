package com.iyte.thesisproject.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;

import com.iyte.thesisproject.domain.FeedModel;

public class FeedRepositoryImpl implements FeedRepositoryCustom{
	
	@Autowired
    MongoTemplate mongoTemplate;

	@Override
	public List<FeedModel> getFeedsBySearchedName(String name) {
		
		BasicQuery query1 = new BasicQuery("{ $text: { $search: \"  "+ name + "\" } }");
		
		//BasicQuery query1 = new BasicQuery("{ $text: { $search: \"\\\"Fatih Terim\\\"\" } }");
		
		List<FeedModel> feeds = mongoTemplate.find(query1, FeedModel.class);
		
		return feeds;
	}
	
	

}
