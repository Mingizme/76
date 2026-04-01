package model;

import java.time.LocalDateTime;

public abstract class Item {
    private String id;
    private String name;
    private double currentPrice;
    private LocalDateTime endTime;

    public Item(String id, String name, double startingPrice, LocalDateTime endTime) {
        this.id = id;
        this.name = name;
        this.currentPrice = startingPrice;
        this.endTime = endTime;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double newPrice) {
        this.currentPrice = newPrice;
    }

    public String getName() {
        return name;
    }
}
