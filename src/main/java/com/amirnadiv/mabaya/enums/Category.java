package com.amirnadiv.mabaya.enums;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public enum Category {

    CLOTHING(1),JEWELRY(2),VEHICLE(3),FURNITURE(4),BOOKS(5);

    Category(int i) {

    }

    public static Category getRandomCategory() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }




}
