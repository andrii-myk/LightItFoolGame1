package com.gmail.andriimyk;

import com.gmail.andriimyk.cards.Card;
import com.gmail.andriimyk.cards.CardFactory;

import java.util.*;

public class Deck {
    private List<Card> cardDeck; // collection of subclasses object Card
    char [] suits = {'♣', '♤', '♥', '♢'}; // it contains suits for creating Desk
    private char trump;
    private Deque<Card> cardsStack;

    public Deque<Card> getCardsStack() {
        return cardsStack;
    }

    public Deck() {
        //class constructor
        cardDeck = new ArrayList<>(36);
        trump = randomSetTrump();
        cardDeck = initDeck();
        shuffleDeck();
        cardsStack = getCardsDeck(cardDeck);
    }

    public char getTrump() {
        return trump;
    }

    private char randomSetTrump(){
        //this method returns char suit which is trump
        Random rand = new Random();
        return suits[rand.nextInt(4)];
    }

    private List<Card> initDeck(){
        //initiate collection which contains 36 cards different suits and nominals
        List<Card> list = new ArrayList<>();
        boolean isTrump = false;
        for(int i = 0; i < suits.length; i++){
            isTrump = trump == suits[i];
            for(int j = 6; j < 15; j++){
                list.add(CardFactory.createCard(j, suits[i], isTrump ));
            }
        }

        return list;
    }

    private void shuffleDeck(){
        Collections.shuffle(cardDeck);
    }

    public Deque<Card> getCardsDeck(List<Card> list) {
        return new ArrayDeque<Card>(list);
    }
}
