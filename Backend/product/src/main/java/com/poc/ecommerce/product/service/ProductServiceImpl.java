package com.poc.ecommerce.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        // TODO Auto-generated method stub
        return productRepo.findById(id).orElse(null);

    }

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return productRepo.findAll();
    }

    @Override
    public Product updateProduct(String id, Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public void deleteProduct(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
    }

}
