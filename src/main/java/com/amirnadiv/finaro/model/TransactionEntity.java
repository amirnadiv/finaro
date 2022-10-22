package com.amirnadiv.finaro.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Objects;

@Entity
@Table(name = "TRASACTIONS")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "invoice")
    private Long invoice;
    @Column(name = "amount")
    @Min(0L)
    private Double amount;
    @Column(name = "currency")
    private String currency;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cardholderid")
    private CardHolderEntity cardHolder;
    @OneToOne(cascade = CascadeType.ALL)
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionEntity that = (TransactionEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(invoice, that.invoice) && Objects.equals(amount, that.amount) && Objects.equals(currency, that.currency) && Objects.equals(cardHolder, that.cardHolder) && Objects.equals(card, that.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoice, amount, currency, cardHolder, card);
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
