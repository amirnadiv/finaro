package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dto.Card;
import com.amirnadiv.finaro.dto.CardHolder;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("cardHolderBL")
@Configurable
public interface CardHolderBL {

    CardHolder getCardHolder(Integer categoryNumber);

    Collection<Card> getAllCardHolders();
}
