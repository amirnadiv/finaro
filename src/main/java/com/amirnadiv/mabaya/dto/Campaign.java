package com.amirnadiv.mabaya.dto;

import java.util.Date;
import java.util.Objects;

public class Campaign {
    private String id;
    private String name;
    private Date startDate;
    private Double bid;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campaign campaign = (Campaign) o;
        return Objects.equals(id, campaign.id) && Objects.equals(name, campaign.name) && Objects.equals(startDate, campaign.startDate) && Objects.equals(bid, campaign.bid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, startDate, bid);
    }
}
