package utilities;

import cards.Card;
import cards.UnitCards.UnitCard;

import java.util.List;
import java.util.Scanner;

public class SimpleIO {

    Scanner in = new Scanner(System.in);

    private static final SimpleIO instance = new SimpleIO();

    public static SimpleIO getInstance() {
        return instance;
    }

    public String getInput() {
        String output = in.nextLine();
        return output;
    }

    public void introMessage() {
        System.out.println("Welcome to the game");
    }

    public String outputListOfUnits(List<UnitCard> list) {
        StringBuilder output = new StringBuilder();
        for (UnitCard card : list) {
            output.append(card.toString()).append("\n");
        }
        System.out.println(output.toString());
        return output.toString();
    }

    public String outputListOfCards(List<Card> cards) {
        StringBuilder output = new StringBuilder();
        for (Card card : cards) {
            output.append(card.toString()).append("\n");
        }
        System.out.println(output.toString());
        return output.toString();
    }


}