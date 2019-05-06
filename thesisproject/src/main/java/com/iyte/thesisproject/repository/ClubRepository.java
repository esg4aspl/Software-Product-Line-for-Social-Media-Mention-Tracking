package com.iyte.thesisproject.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iyte.thesisproject.domain.Club;
import com.iyte.thesisproject.domain.TrackedMember;

@Repository
public interface ClubRepository extends MongoRepository<Club, ObjectId>{
	
}