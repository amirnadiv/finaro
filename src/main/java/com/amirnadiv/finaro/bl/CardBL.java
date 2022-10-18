package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dto.Card;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("cardBL")
@Configurable
public interface CardBL {

    Card createCard(Card card);

    Collection<Card> getAllCards();
}
