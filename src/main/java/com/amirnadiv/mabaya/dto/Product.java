package com.amirnadiv.mabaya.dto;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Product {

    private Long id;
    private String name;
    private Date startDate;
    private Integer category;
    private List<Campaign> campaigns;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(startDate, product.startDate) && Objects.equals(category, product.category) && Objects.equals(campaigns, product.campaigns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, startDate, category, campaigns);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", category=" + category +
                ", campaigns=" + campaigns +
                '}';
    }
}
