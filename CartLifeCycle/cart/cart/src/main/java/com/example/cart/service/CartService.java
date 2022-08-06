package com.example.cart.service;

import com.example.cart.entity.Cart;
import com.example.cart.entity.Product;
import com.example.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private  RestTemplate restTemplate;

    private Cart cart=new Cart();
   public int cno=0;

    public void addToCart(int pid) {
        Product product=restTemplate.getForObject("http://localhost:8080/store/getProductById/"+ pid ,Product.class);
        cart.setCid(++cno);
         cart.setProduct(product);
         cart.setQuantity(1);
         cartRepository.save(cart);
    }

    public void updateQuantity(Cart cart) {
        cartRepository.save(cart);
    }

    public List<Cart> getAllCartProducts() {
        return cartRepository.findAll();
    }

    public Optional<Cart> getProductInCartById(int cid) {
        return cartRepository.findById(cid);
    }

    public void deleteProductInCart(int cid) {
        cartRepository.deleteById(cid);
    }
}
