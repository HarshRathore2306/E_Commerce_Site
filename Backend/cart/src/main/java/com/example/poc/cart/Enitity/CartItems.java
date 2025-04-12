package com.example.poc.cart.Enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Data
@Setter
@AllArgsConstructor
public class CartItems {

    @Id
    private String cartItemId;
    private String productId;   
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "cartId")
    private Cart cart; // Reference to the Cart entity to which this item belongs

}
