package com.gmail.andriimyk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        greetingsAndRules();
        int x = getPlayerNum();// variable vhich stores user input
        Table table = new Table(x);
        table.runGame();

        //System.out.println("you have enterd " + x);
    }
    private static int getPlayerNum() {
        // function which returns user input for number of players
        int number = 0;
        boolean flag = false;
        while (!flag) {
            try {
                Scanner in = new Scanner(System.in);
                number = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You have enterd wrong value. Please repeat.");
            }
            if (number > 0 & number <= 6) flag = true;
        }
        return number;
    }

    private static void greetingsAndRules(){
        // Greetings for user and explaining rules
        System.out.println("Hello, my friend.\nWelcome to the demo version of the greatest game in history " +
                " on this sublanary planet - LightItFoolGame!!!");
        System.out.println("\nFirstly, you should know that: "+
                "\n♣ - is used for clubs" +
                "\n♤ - for spades" +
                "\n♥ - for hearts" +
                "\n♢ - (sure, you have already guessed it) - for diamonds");
        System.out.println("To designate playing cards I'm going to use first letter of card name or number for " +
                "number cards. For example: \n'A' - for Ace, \n'K' - for King, \n'Q' - for Queen, \n'J' - for Jack, \n'10' - for " +
                "Ten, \n'9' - for Nine, etc.");
        System.out.println("\nNow, your mainly purpose in life is to give me a number of players, which will be playing " +
                "in this brilliant creation of binary gods.");
        System.out.println("Please enter a number (number I said) of players in range 1 to 6, and remember, young padawan, - " +
                "BIG BROTHER IS WATCHING YOU.");
    }
}
