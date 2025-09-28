package com.pricetracker.price_tracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pricetracker.price_tracker.entity.PriceHistory;

public interface ProductHistory extends JpaRepository<PriceHistory, Long> {

}
