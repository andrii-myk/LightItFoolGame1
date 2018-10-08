package com.gmail.andriimyk.cards;

public class Ten extends Card {
    //this class represents 'Ten' card
    public Ten(char suit, boolean isTrump) {
        super(suit, isTrump);
        this.cardname = "10";
        this.value = 10;
    }
}
