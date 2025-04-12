package com.example.poc.cart.controller;

import org.hibernate.Remove;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.poc.cart.CartService.CartService;
import com.example.poc.cart.Enitity.Cart;
import com.example.poc.cart.Enitity.CartItems;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/cart")
public class CartController {


    @Autowired
    private CartService cartService;

    
// Get cart items for user
@GetMapping("/getCart/{userId}")
public ResponseEntity<Cart> getCartByUserId(@PathVariable String userId) {
    // Logic to get the cart for the user
    return ResponseEntity.ok(cartService.getCartByUserId(userId));
}

//  Add item to cart
@PostMapping("/addToCart")
public ResponseEntity<Cart> addToCart(@RequestBody CartItems cart) {
    // Logic to add item to the cart
    return ResponseEntity.ok(cartService.addToCart(cart));
}

// PUT /update – Update quantity
@PutMapping("UpdateQuantity/{id}")
public ResponseEntity<Object> updateQuantity(@PathVariable String id, @RequestParam int quantity) {
    // Logic to update the quantity of an item in the cart
    return ResponseEntity.ok(cartService.updateQuantity(id, quantity));
}


// DELETE /remove/{cartItemId} – Remove item from cart

    //getting all product from the prodict


}
