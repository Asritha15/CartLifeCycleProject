package com.example.cart.repository;

import com.example.cart.entity.OrderCompletion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCompletionRepository extends MongoRepository<OrderCompletion,Integer> {
}
