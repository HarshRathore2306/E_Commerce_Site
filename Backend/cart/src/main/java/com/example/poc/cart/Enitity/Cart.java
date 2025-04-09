package com.example.poc.cart.Enitity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor

public class Cart {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private String cartId;
    private String userId;
    private String productId;
    private int quantity;
    private double price;
    

}
