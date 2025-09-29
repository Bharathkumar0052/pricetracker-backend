package com.pricetracker.price_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricetracker.price_tracker.Repositories.ProductHistory;
import com.pricetracker.price_tracker.Repositories.ProductRepository;
import com.pricetracker.price_tracker.entity.PriceHistory;
import com.pricetracker.price_tracker.entity.Product;

@Service
public class PriceService {
    @Autowired
    private ProductRepository productRepoitory;

    @Autowired
    private ProductHistory productHistoryRepository;

    public void trackAllPrices() {

        List<Product> products = productRepoitory.findAll();
        for (Product product : products) {
            Double newPrice = Math.round((10 + Math.random() * 990) * 100.0) / 100.0;
            product.setCurrentPrice(newPrice);
            productRepoitory.save(product);

            PriceHistory priceHistory = new PriceHistory();
            priceHistory.setProduct(product);
            priceHistory.setPrice(newPrice);                    
            priceHistory.setTimestamp(java.time.LocalDateTime.now());
            productHistoryRepository.save(priceHistory);
            System.out.println("💰 Tracked " + product.getName() + ": $" + newPrice);
        }

    }

}
