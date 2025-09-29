package com.pricetracker.price_tracker.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pricetracker.price_tracker.Repositories.ProductRepository;
import com.pricetracker.price_tracker.entity.Product;

@Service
public class ProductSerevice {

    private ProductRepository prodrepo;

    public Product saveProduct(Product product){
        product.setCreatedAt(LocalDateTime.now());
        return prodrepo.save(product);
    }
    public List<Product> getAllProducts(){
        return prodrepo.findAll();
    }

    
}
