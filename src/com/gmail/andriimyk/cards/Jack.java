package com.gmail.andriimyk.cards;

public class Jack extends Card{
    //this class represents 'Jack/Knight/Fishhook/J-boy' card
    public Jack(char suit, boolean isTrump) {
        super(suit, isTrump);
        this.cardname = "J";
        this.value = 11;
    }


}
