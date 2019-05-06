package com.iyte.thesisproject.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iyte.thesisproject.domain.Feed;
import com.iyte.thesisproject.repository.FeedRepository;


@Service
public class FeedService {
	
	@Autowired
	private FeedRepository feedRepository;

	public List<Feed> findAllFeeds() {
					
		return feedRepository.findAll();
	
	}

	public Feed findBy_id(ObjectId id) {
		
		return feedRepository.findBy_id(id);
	}

	public List<Feed> getFeedsByName(String name) {

		return feedRepository.getFeedsBySearchedName(name);
	}
	
}
