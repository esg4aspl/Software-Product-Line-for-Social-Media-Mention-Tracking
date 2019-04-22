package com.iyte.thesisproject.controller;

import java.util.Collections;
import java.util.List;

import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iyte.thesisproject.domain.FeedModel;
import com.iyte.thesisproject.service.FeedService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class FeedController {

	@Autowired
	private FeedService feedService;
	
	 
	@GetMapping("/allFeeds")
	public List<FeedModel> getAllFeeds() {

		//return feedService.findAllFeeds().subList(0, 10);
		
		return feedService.findAllFeeds();

	}
	
	@RequestMapping(value = "searchName/{name}", method = RequestMethod.GET)
	public List<FeedModel> getFeedsByName(@PathVariable("name") String name) {

		//return feedService.findAllFeeds().subList(0, 10);
		
		System.out.println("A name is searched, searched name:" + name);
		
		List<FeedModel> feedsInludingGivenName = feedService.getFeedsByName(name);
	
		System.out.println("Founded feed count:" + feedsInludingGivenName.size());
		
		return feedsInludingGivenName;

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public FeedModel getFeedModelById(@PathVariable("id") ObjectId id) {
	  
		return feedService.findBy_id(id);
	}
	
	
}
