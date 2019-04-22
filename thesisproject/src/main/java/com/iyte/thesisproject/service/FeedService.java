package com.iyte.thesisproject.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iyte.thesisproject.domain.FeedModel;
import com.iyte.thesisproject.repository.FeedRepository;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@Service
public class FeedService {
	
	@Autowired
	private FeedRepository feedRepository;

	public List<FeedModel> findAllFeeds() {
			
		List<FeedModel> feeds = feedRepository.findAll();
		
		List<FeedModel> resultingFeeds = new ArrayList<FeedModel>();
		
		
		for(FeedModel feed: feeds) {
			
			if(feed.getDescription().contains("Galatasaray") ||
			   feed.getDescription().contains("GS") ||
			   feed.getDescription().contains("galatasaray") ||
			   feed.getDescription().contains("G.saray") ||
			   feed.getDescription().contains("Gs") ||
			   feed.getDescription().contains("gs") 
					
			) {
				
				resultingFeeds.add(feed);
				
			}
			
		}
		
		return resultingFeeds;
	
	}

	public FeedModel findBy_id(ObjectId id) {
		
		return feedRepository.findBy_id(id);
	}

	public List<FeedModel> getFeedsByName(String name) {

		return feedRepository.getFeedsBySearchedName(name);
	}
	
}
