package com.iyte.thesisproject.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.iyte.thesisproject.domain.Feed;

@Repository
public interface FeedRepository extends MongoRepository<Feed, ObjectId>, FeedRepositoryCustom{
	
	  Feed findBy_id(ObjectId _id);
		  
}
