package com.example.poc.cart.Enitity;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    private List<CartItems> cartItems =new ArrayList<>(); // List of product IDs in the cart
   

   

    

}
