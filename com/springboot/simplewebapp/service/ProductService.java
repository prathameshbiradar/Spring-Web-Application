package com.springboot.simplewebapp.service;

import com.springboot.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> product = new ArrayList<>(Arrays.asList(
            new Product(111,"Mobile",50000),
            new Product(112,"Fashion",10000)));
    public List<Product> getProducts()
    {
        return product;
    }
    public Product getProductById(int prodId)
    {
        return product.stream().filter(p -> p.getProductId() == prodId).findFirst().get();
    }

    public void addProducts(Product prod)
    {
        product.add(prod);
    }
    public void updateProduct(Product prod)
    {
        int index=0;
        for(int i=0;i<product.size();i++)
        {
            if(product.get(i).getProductId()==prod.getProductId())
            {
                 index = i;
            }
        }
        product.set(index,prod);
    }
    public void deleteProduct(int prodId)
    {
        int index=0;
        for(int i=0;i<product.size();i++)
        {
            if(product.get(i).getProductId()==prodId)
            {
                index=i;
            }
        }
        product.remove(index);
    }
}
