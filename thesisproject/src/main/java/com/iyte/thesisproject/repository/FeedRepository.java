package com.iyte.thesisproject.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.iyte.thesisproject.domain.FeedModel;

@Repository
public interface FeedRepository extends MongoRepository<FeedModel, ObjectId>, FeedRepositoryCustom{
	
	  FeedModel findBy_id(ObjectId _id);
		  
}
