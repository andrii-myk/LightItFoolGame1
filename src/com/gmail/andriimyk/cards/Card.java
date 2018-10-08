package com.gmail.andriimyk.cards;

public abstract class Card {
    protected int value;
    protected String cardname;
    protected char suit;
    protected boolean isTrump;

    public Card(char suit, boolean isTrump) {
        this.suit = suit;
        this.isTrump = isTrump;
    }

    public float returnCardValue(){
        if(isTrump){
            return (float) (value * 1.5);
        }
        return value;
    }

    @Override
    public String toString() {
        return  suit +cardname;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public boolean isTrump() {
        return isTrump;
    }

    public void setTrump(boolean trump) {
        isTrump = trump;
    }
}
