package com.poc.ecommerce.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.ecommerce.product.entity.Product;

@Service
public interface ProductService {

    Product createProduct(Product product);
    Product getProductById(String id);
    List<Product> getAllProducts();
    Product updateProduct(String id, Product product);
    void deleteProduct(String id);

}
