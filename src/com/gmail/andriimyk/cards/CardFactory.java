package com.gmail.andriimyk.cards;

public class CardFactory {

    public static Card createCard(int value, char suit, boolean isTrump){
        Card card = null;
        if (value == 6){
            card =  new Six(suit, isTrump);
        }
        if (value == 7){
            card = new Seven(suit, isTrump);
        }
        if (value == 8){
            card = new Eight(suit, isTrump);
        }
        if (value == 9){
            card = new Nine(suit, isTrump);
        }
        if (value == 10){
            card = new Ten(suit, isTrump);
        }
        if (value == 11){
            card = new Jack(suit, isTrump);
        }
        if (value == 12){
            card = new Queen(suit, isTrump);
        }
        if (value == 13){
            card = new King(suit, isTrump);
        }
        if (value == 14){
            card = new Ace(suit, isTrump);
        }
    return card;
    }
}
