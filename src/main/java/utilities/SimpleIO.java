package utilities;

import cards.Card;
import cards.UnitCards.UnitCard;

import java.util.List;
import java.util.Scanner;

public class SimpleIO {

    private static final SimpleIO instance = new SimpleIO();

    public static SimpleIO getInstance() {
        return instance;
    }

    public void println(String message) {
        System.out.println(message);
    }

    public void print(String msg) {
        System.out.print(msg);
    }

    //for getting input with a message
    public String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }

    //for getting input with no message
    public String getStringInput() {
        return getStringInput(" ");
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