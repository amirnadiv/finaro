package com.amirnadiv.finaro.dto;

import java.util.Objects;

public class Card {

    private Long id;
    private String cardHolderName;
    private String pan;
    private String expiryDate;
    private String cvv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(id, card.id) && Objects.equals(cardHolderName, card.cardHolderName) && Objects.equals(pan, card.pan) && Objects.equals(expiryDate, card.expiryDate) && Objects.equals(cvv, card.cvv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardHolderName, pan, expiryDate, cvv);
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", pan='" + pan + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
