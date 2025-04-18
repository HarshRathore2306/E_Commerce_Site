package com.poc.ecommerce.product.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Document("product")
public class Product {

    @Id
    private String Product_id;

    private String name;
    private String description;
    private int quantity;
    private double price;

    private String categoryId;


    
}
