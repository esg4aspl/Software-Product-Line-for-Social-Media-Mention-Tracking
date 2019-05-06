package com.iyte.thesisproject.repository;

import java.util.List;

import com.iyte.thesisproject.domain.Feed;

public interface FeedRepositoryCustom{

	public List<Feed> getFeedsBySearchedName(String name);

}
