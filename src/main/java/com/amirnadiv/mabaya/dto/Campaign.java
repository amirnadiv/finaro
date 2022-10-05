package com.amirnadiv.mabaya.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Campaign {
    private String id;
    private String name;
    private LocalDateTime startDate;
    private Double bid;
    private List<Product> products;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campaign campaign = (Campaign) o;
        return Objects.equals(id, campaign.id) && Objects.equals(name, campaign.name) && Objects.equals(startDate, campaign.startDate) && Objects.equals(bid, campaign.bid) && Objects.equals(products, campaign.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, startDate, bid, products);
    }
}
