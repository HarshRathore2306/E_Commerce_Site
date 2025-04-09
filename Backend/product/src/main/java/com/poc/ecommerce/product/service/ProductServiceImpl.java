package com.poc.ecommerce.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.ecommerce.product.Exception.ResourceNotFound;
import com.poc.ecommerce.product.entity.Product;
import com.poc.ecommerce.product.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product createProduct(Product product) {
        return productRepo.save(product);

    }

    @Override
    public Product getProductById(String id) {
        return productRepo.findById(id).orElseThrow(() -> new ResourceNotFound("Product not found with id: " + id));

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product updateProduct(String id, Product product) {
        return productRepo.findById(id).map(existingProduct -> {
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setCategoryId(product.getCategoryId());
            return productRepo.save(existingProduct);
        }).orElseThrow(() -> new ResourceNotFound("Product not found with id: " + id));
    }

    @Override
    public void deleteProduct(String id) {
        productRepo.findById(id).map(existingProduct -> {
            productRepo.delete(existingProduct);
            return null;
        }).orElseThrow(() -> new ResourceNotFound("Product not found with id: " + id));
    }

}
