package com.example.poc.cart.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.poc.cart.Enitity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, String> {

    public Optional<Cart> findByUserId(String userId);

    
}
