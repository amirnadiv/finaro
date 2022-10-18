package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dao.CardRepository;
import com.amirnadiv.finaro.dto.Card;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class CardBLImpl implements CardBL {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    ModelMapper modelMapper;

    public Card createCard(Card card) {
        return new Card();


    }


    @Override
    public Collection<Card> getAllCards() {
        return new ArrayList<>();
    }
}
