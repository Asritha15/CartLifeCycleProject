package com.example.store.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="Products")
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private int price;
}
