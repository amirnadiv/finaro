package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.dto.CardHolder;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("productService")
@Configurable
public interface CardHolderService {

     Collection<CardHolder> getAllCardHolders();

}
