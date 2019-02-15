package com.qa.Pool.persistance.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.Pool.persistance.domain.SentAccount;

@Repository
public interface MongoAccountRepo extends MongoRepository<SentAccount, Long>{
}
