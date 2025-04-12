package com.poc.ecommerce.user.UserService.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.poc.ecommerce.user.UserEntity.Cart;

@FeignClient(name = "CART")
public interface CartService {

    @GetMapping("/cart/getCartByUserId/{userId}")
    Cart getCartByUserId(@PathVariable String userId);
}
