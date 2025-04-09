package com.example.poc.cart.CartService;

import com.example.poc.cart.Enitity.Cart;

public interface CartService {
    public Cart getCartByUserId(String cartId);
    public Cart addToCart(Cart cart);
    
}
