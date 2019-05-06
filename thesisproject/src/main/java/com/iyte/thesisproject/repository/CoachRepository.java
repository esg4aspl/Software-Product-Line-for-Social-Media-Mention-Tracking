package com.iyte.thesisproject.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iyte.thesisproject.domain.Coach;

@Repository
public interface CoachRepository extends MongoRepository<Coach, ObjectId>{
	
}
