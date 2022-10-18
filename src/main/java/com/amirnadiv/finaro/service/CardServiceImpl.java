package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.bl.CardBL;
import com.amirnadiv.finaro.dto.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CardServiceImpl implements CardService {


    @Autowired
    CardBL cardBL;

    @Override
    public Card createCard(Card card) {
        return null;
    }

    @Override
    public Collection<Card> getAllCards() {
        return null;
    }
}