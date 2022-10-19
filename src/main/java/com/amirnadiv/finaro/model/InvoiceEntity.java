package com.amirnadiv.finaro.model;

import javax.persistence.*;

@Entity
@Table(name = "INVOICES")
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "InvoiceEntity{" +
                "id=" + id +
                '}';
    }
}
