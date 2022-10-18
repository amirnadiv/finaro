package com.amirnadiv.finaro.model;

import javax.persistence.*;

@Entity
@Table(name = "TRASACTIONS")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "invoice")
    private Long invoice;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "currency")
    private String currency;
    @OneToOne
    @JoinColumn(name = "cardholderid")
    private CardHolderEntity cardHolder;
    @OneToOne
    @JoinColumn(name = "cardid")
    private CardEntity card;

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

    public CardHolderEntity getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolderEntity cardHolder) {
        this.cardHolder = cardHolder;
    }

    public CardEntity getCard() {
        return card;
    }

    public void setCard(CardEntity card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "TransactionEntity{" +
                "id=" + id +
                ", invoice=" + invoice +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", cardHolder=" + cardHolder +
                ", card=" + card +
                '}';
    }
}
