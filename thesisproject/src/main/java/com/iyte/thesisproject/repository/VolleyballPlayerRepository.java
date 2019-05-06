package com.iyte.thesisproject.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iyte.thesisproject.domain.VolleyballPlayer;


@Repository
public interface VolleyballPlayerRepository extends MongoRepository<VolleyballPlayer, ObjectId>{
}
