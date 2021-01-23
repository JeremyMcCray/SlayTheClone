package utilities;

import cards.UnitCard;

import java.util.List;
import java.util.Scanner;

public class SimpleIO{

    Scanner in = new Scanner(System.in);


    public String getInput(){
        String output = in.nextLine();
        return output;
    }

    public String introMessage(){
        String output = "Welcome to the game\n [1] Start Game \n [2] Exit Game";
        return output;
    }

    public String outputListOfUnits(List<UnitCard> list){
        StringBuilder output= new StringBuilder();
        for (UnitCard card: list) {
            output.append(card.toString()).append("\n");
        }
        System.out.println(output.toString());
        return output.toString();
    }

}