package com.pricetracker.price_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriceTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceTrackerApplication.class, args);
		System.out.println("Hello, Price Tracker Application is running in port 9090!");
	}

}
