package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.bl.CardHolderBL;
import com.amirnadiv.finaro.dto.CardHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CardHolderServiceImpl implements CardHolderService {

    @Autowired
    CardHolderBL cardHolderBL;


    @Override
    public Collection<CardHolder> getAllCardHolders() {
        return null;
    }
}