package com.example.cart.repository;

import com.example.cart.entity.DeliveryDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryRepository extends MongoRepository<DeliveryDetails,Integer> {
}
