package com.example.cart.controller;

import com.example.cart.entity.Cart;
import com.example.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/addToCart/{pid}")
    public void addToCart(@PathVariable int pid){
         cartService.addToCart(pid);
    }

    @PutMapping("/updateCart")
    public void updateQuantity(@RequestBody Cart cart) {
        cartService.updateQuantity(cart);
    }

    @GetMapping("/getAllCartProducts")
    public List<Cart> getAllCartProducts(){
        return cartService.getAllCartProducts();
    }
    @GetMapping("/getProductInCartById/{cid}")
    public Optional<Cart> getProductInCartById(@PathVariable int cid){
        return  cartService.getProductInCartById(cid);
    }

    public void deleteProductInCart(@PathVariable int cid){
         cartService.deleteProductInCart(cid);
    }

    }

