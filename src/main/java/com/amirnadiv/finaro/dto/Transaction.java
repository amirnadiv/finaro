package com.amirnadiv.finaro.dto;

import java.util.Objects;

public class Transaction {

    private Long id;
    private Long invoice;
    private Double amount;
    private String currency;
    private CardHolder cardHolder;
    private Card card;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInvoice() {
        return invoice;
    }

    public void setInvoice(Long invoice) {
        this.invoice = invoice;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id) && Objects.equals(invoice, that.invoice) && Objects.equals(amount, that.amount) && Objects.equals(currency, that.currency) && Objects.equals(cardHolder, that.cardHolder) && Objects.equals(card, that.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoice, amount, currency, cardHolder, card);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", invoice=" + invoice +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", cardHolder=" + cardHolder +
                ", card=" + card +
                '}';
    }
}
