package com.amirnadiv.mabaya.model;

import com.amirnadiv.mabaya.enums.Category;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "CAMPAIGNS")
public class CampaignEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "category")
    private Category category;
    @Column(name = "bid")
    private Double bid;

    @Column(name = "start_date")
    @Nullable
    private LocalDateTime startDate;
    @OneToMany(fetch = FetchType.EAGER)
    private List<ProductEntity> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "CampaignEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", bid=" + bid +
                ", startDate=" + startDate +
                ", products=" + products +
                '}';
    }
}
