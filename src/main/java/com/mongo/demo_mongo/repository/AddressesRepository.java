package com.mongo.demo_mongo.repository;

import com.mongo.demo_mongo.dto.AddressesDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressesRepository extends MongoRepository<AddressesDto, String> {
}
