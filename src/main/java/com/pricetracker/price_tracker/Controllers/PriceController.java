package com.pricetracker.price_tracker.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pricetracker.price_tracker.service.PriceService;

@RestController
@RequestMapping("/api/prices")
public class PriceController {
    
    @Autowired
    private PriceService priceService;
    
    @PostMapping("/track-now")
    public String trackPricesNow() {
        priceService.trackAllPrices();
        return "Price tracking started manually!";
    }
}
