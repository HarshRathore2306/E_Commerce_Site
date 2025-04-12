package com.example.poc.cart.CartService;

import org.springframework.stereotype.Service;

import com.example.poc.cart.Enitity.Cart;
import com.example.poc.cart.Enitity.CartItems;

@Service
public interface CartService {
    public Cart getCartByUserId(String userId);
    // public Cart addToCart(Cart cart);
    public Cart updateCartItem(CartItems cartitems);
    public Cart removeCartItemByCartItemId(String cartItemId);
    public Cart removeCartItemByProductId(String productId);
    public Cart addToCart(CartItems cartiItems);
    public Object updateQuantity(String id, int quantity); 

    
    
}
