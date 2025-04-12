package com.example.poc.cart.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poc.cart.Enitity.Cart;
import com.example.poc.cart.Enitity.CartItems;
import com.example.poc.cart.Repository.CartRepo;
import com.netflix.discovery.converters.Auto;


@Service
public class CartServiceImpl implements CartService {
    
    @Autowired
    private CartRepo cartRepository;

    @Override
    public Cart getCartByUserId(String userId) {
        // Implementation to retrieve a cart by user ID from the database
        return cartRepository.findByUserId(userId).orElse(null);    
    }


    @Override
    public Cart addToCart(CartItems cartItems) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToCart'");
    }

    @Override
    public Cart updateCartItem(CartItems cartitems) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCartItem'");
    }

    @Override
    public Cart removeCartItemByCartItemId(String cartItemId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeCartItemByCartItemId'");
    }

    @Override
    public Cart removeCartItemByProductId(String productId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeCartItemByProductId'");
    }


    


    @Override
    public Object updateQuantity(String id, int quantity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateQuantity'");
    }

}
