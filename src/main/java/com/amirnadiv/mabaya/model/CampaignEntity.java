package com.amirnadiv.mabaya.model;

import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.enums.Category;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CAMPAIGNS")
public class CampaignEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "category")
    private Category category;
    @Column(name = "bid")
    private Double bid;
    @Column(name = "start_date")
    private Date startDate;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "CampaignEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", bid=" + bid +
                ", startDate=" + startDate +
                '}';
    }
}
