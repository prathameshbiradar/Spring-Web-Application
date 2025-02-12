package com.springboot.simplewebapp.service;

import com.springboot.simplewebapp.model.Product;
import com.springboot.simplewebapp.repository.ProductReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductReository repository;

//    List<Product> product = new ArrayList<>(Arrays.asList(
//            new Product(111,"Mobile",50000),
//            new Product(112,"Fashion",10000)));
    public List<Product> getProducts()
    {
        return repository.findAll();
    }
    public Product getProductById(int prodId)
    {
        return repository.findById(prodId).orElse(new Product(000,null,000));
    }

    public void addProducts(Product prod)
    {
        repository.save(prod);
    }
    public void updateProduct(Product prod)
    {
       repository.save(prod);
    }
    public void deleteProduct(int prodId)
    {
        repository.deleteById(prodId);
    }
}
