package com.iyte.thesisproject.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iyte.thesisproject.domain.ClubManager;

@Repository
public interface ClubManagerRepository extends MongoRepository<ClubManager, ObjectId>{
	
}
