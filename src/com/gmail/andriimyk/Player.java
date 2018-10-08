package com.gmail.andriimyk;

import com.gmail.andriimyk.cards.Card;

import java.util.List;

public class Player {
    int number;
    private List<Card> playerHand;

    public Player(int number, List cards) {
        this.number = number;
        playerHand = cards;
    }
    public void addCardToHand(Card card){
        playerHand.add(card);
    }
    private String handToString(){
        //returns String represent of player's list cards
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < playerHand.size(); i++) {
            Card card = playerHand.get(i);
            if (card.isTrump()) {
                builder.append("\033[31m" + card.toString() + " \033[0m"); // red for trump cards
            } else {
                builder.append("\033[0m" + card.toString() + " \033[0m"); // default color for other cards
            }
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "Player" + number +
                ", playerHand= {" + handToString() +
                "}";
    }
    public float getTotalPointOfHand(){
        //this method returns total point of cards, player has
        float sum = 0.0f;
        for (Card card : playerHand){
            sum += card.returnCardValue();
         }
     return sum;
    }
}
