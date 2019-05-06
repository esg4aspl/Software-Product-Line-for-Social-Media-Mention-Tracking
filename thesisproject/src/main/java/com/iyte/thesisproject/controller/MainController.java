package com.iyte.thesisproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iyte.thesisproject.domain.Coach;
import com.iyte.thesisproject.domain.TrackedMember;
import com.iyte.thesisproject.service.TrackedMemberService;

@RequestMapping("/api")
@RestController
public class MainController {

	@Autowired
	private TrackedMemberService service;
	
	@GetMapping("/allCoaches")
	public List<Coach> getAllCoaaches() {

		//return feedService.findAllFeeds().subList(0, 10);
		
		return service.findAllCoaches();
	}
	
	
	
}
