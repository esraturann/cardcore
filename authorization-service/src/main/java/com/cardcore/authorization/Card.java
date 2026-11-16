package com.cardcore.authorization;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "masked_number")
    private String maskedNumber;

    @Column(name = "card_limit")
    private BigDecimal cardLimit;

    @Column(name = "available_limit")
    private BigDecimal availableLimit;

    @Version
    private Long version;

    public Long getId() { return id; }
    public String getMaskedNumber() { return maskedNumber; }
    public BigDecimal getCardLimit() { return cardLimit; }
    public BigDecimal getAvailableLimit() { return availableLimit; }
}