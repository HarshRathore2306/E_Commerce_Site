package com.poc.ecommerce.product.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.poc.ecommerce.product.entity.Product;

public interface ProductRepo extends MongoRepository<Product, String> {
    // Custom query methods can be defined here if needed

}
