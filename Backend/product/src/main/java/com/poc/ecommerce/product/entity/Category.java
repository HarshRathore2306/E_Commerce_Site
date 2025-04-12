package com.poc.ecommerce.product.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("category")
@Getter
@Setter
@AllArgsConstructor
public class Category {

    @Id
    private String categoryId;
    private String name;
    

}
