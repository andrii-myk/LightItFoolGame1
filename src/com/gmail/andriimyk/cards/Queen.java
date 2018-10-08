package com.gmail.andriimyk.cards;

public class Queen extends Card {
    //this class represents 'Queen' card
    public Queen(char suit, boolean isTrump) {
        super(suit, isTrump);
        this.cardname = "Q";
        this.value = 12;
    }
}
