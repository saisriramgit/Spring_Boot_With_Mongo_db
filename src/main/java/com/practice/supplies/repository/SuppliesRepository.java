package com.practice.supplies.repository;

import com.practice.supplies.model.Supplies;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SuppliesRepository extends MongoRepository<Supplies, String> {
}
