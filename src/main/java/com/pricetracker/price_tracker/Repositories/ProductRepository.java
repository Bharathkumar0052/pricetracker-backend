package com.pricetracker.price_tracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pricetracker.price_tracker.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
