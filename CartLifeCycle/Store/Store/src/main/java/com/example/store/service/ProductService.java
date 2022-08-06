package com.example.store.service;

import com.example.store.entity.Product;
import com.example.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void deleteProduct(int id) {
         productRepository.deleteById(id);
    }

    public Product updateProduct(Product product) {
       return productRepository.save(product);
    }

    public List<Product> getProducts() {
       return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return  productRepository.save(product);
    }

    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
}
