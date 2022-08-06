package com.example.cart.service;

import com.example.cart.entity.Cart;
import com.example.cart.entity.DeliveryDetails;
import com.example.cart.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class DeliveryService {
@Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private RestTemplate restTemplate;


    int ordNo=0;
    public void addDeliveryDetails(DeliveryDetails deliveryDetails,int cid) {
        Cart cart=restTemplate.getForObject("http://localhost:8081/cart/getProductInCartById/"+ cid ,Cart.class);
        deliveryDetails.setOrderId(++ordNo);
        deliveryDetails.setCart(cart);
        deliveryRepository.save(deliveryDetails);

    }

    public Optional<DeliveryDetails> getDeliveryDetailsById(int id) {
        return deliveryRepository.findById(id);
    }
}
