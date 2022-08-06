package com.example.cart.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="cart")
public class Cart {
    @Id
    private int cid;
    private Product product;
    private int quantity;
}
