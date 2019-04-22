package com.iyte.thesisproject.repository;

import java.util.List;

import com.iyte.thesisproject.domain.FeedModel;

public interface FeedRepositoryCustom{

	public List<FeedModel> getFeedsBySearchedName(String name);

}
