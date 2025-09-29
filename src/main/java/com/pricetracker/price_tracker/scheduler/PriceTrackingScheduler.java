package com.pricetracker.price_tracker.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.pricetracker.price_tracker.service.PriceService;

@Component
public class PriceTrackingScheduler {
    
    @Autowired
    private PriceService priceService;
    
    // Run every 2 minutes
    @Scheduled(fixedRate = 120000)
    public void trackPrices() {
        System.out.println("🕒 Running price check...");
        priceService.trackAllPrices();
    }
}
