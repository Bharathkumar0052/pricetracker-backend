package com.pricetracker.price_tracker.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "price_history")
public class PriceHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Product product;
    private Double price;
    private LocalDateTime timestamp;

    public PriceHistory() {}

    // Add getters and setters for ALL fields
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}