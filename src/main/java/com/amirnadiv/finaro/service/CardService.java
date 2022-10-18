package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.dto.Card;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("campaignService")
@Configurable
public interface CardService {
     Card createCard(Card card);

     Collection<Card> getAllCards();
}
