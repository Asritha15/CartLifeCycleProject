package com.example.store.controller;

import com.example.store.entity.Product;
import com.example.store.repository.ProductRepository;
import com.example.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/store")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getProducts(){
       return productService.getProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
       return productService.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable int id) {
         productService.deleteProduct(id);
    }
}
