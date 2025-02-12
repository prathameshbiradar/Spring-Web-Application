package com.springboot.simplewebapp.controller;

import com.springboot.simplewebapp.model.Product;
import com.springboot.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController    //used RestController to send the data to client
public class ProductController {

    @Autowired     // Binding automatically with ProductService Bean
    ProductService service;

    @GetMapping("/product")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }
    @GetMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return service.getProductById(prodId);
    }
    @PostMapping("/product")
    public void addProducts(@RequestBody Product prod)
    {
        service.addProducts(prod);
    }
    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod)
    {
        service.updateProduct(prod);
    }
    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId)
    {
        service.deleteProduct(prodId);
    }
}
