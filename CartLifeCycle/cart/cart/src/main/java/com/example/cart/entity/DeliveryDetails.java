package com.example.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Document(collection="deliveryDetails")
    public class DeliveryDetails {
        @Id
        private int orderId;
        private Cart cart;
        private String address;
        private Long phone;
        private String payment;
    }

