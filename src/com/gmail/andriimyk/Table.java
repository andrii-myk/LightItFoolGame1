package com.gmail.andriimyk;

import com.gmail.andriimyk.cards.Card;


import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Table {
    private List<Player> players;// players collection with size that was given by user input
    private Deck deckObj;
    private int playerNum;
    private Deque<Card> deckInstance; //actually a deck instance

    public Table(int playerNum) {
        this.playerNum = playerNum;
        players = initPlayersList(playerNum);
        deckObj = new Deck();
        deckInstance = deckObj.getCardsStack();
        cardDeal();
    }

    public void runGame(){
        Table table = new Table(this.playerNum);
        System.out.println("In this deal Trump (not Donald) is: " + deckObj.getTrump());
        printPlayers(players);
        System.out.println("Winner is: " + returnMostPowerfulCardhand(players));
    }

    private List<Player> initPlayersList(int playerNum){
        List list = new ArrayList();
        for (int i = 0; i < playerNum; i++){
            list.add(new Player((i + 1), new ArrayList()));
        }
        return list;
    }

    private void cardDeal(){
        // add one card per iteration to player's hand
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < players.size(); j++){
                players.get(j).addCardToHand(deckInstance.pollLast());
            }
        }
    }
    private void printPlayers(List<Player> players){
        //displays player hand in console
        for (int i = 0; i < players.size(); i++){
            System.out.println(players.get(i));
        }
    }
    private Player returnMostPowerfulCardhand(List<Player> players){
        float sum = 0.0f;
        int index = 0;
        for (int i = 0; i < players.size(); i++){
            float temp = players.get(i).getTotalPointOfHand();
            if(temp > sum){
                sum = temp;
                index = i;
            }
        }
        //System.out.println("Sum is: " + sum);
        return players.get(index);
    }
}
