package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dao.CardHolderRepository;
import com.amirnadiv.finaro.dto.Card;
import com.amirnadiv.finaro.dto.CardHolder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CardHolderBLImpl implements CardHolderBL {

    @Autowired
    CardHolderRepository cardHolderRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public Collection<Card> getAllCardHolders() {
        return null;
    }

    @Override
    public CardHolder getCardHolder(Integer categoryNumber) {
        return null;
    }
}
