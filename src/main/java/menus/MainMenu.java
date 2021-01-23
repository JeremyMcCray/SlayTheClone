package menus;

import utilities.SimpleIO;

public class MainMenu {
    SimpleIO simpleIO = SimpleIO.getInstance();
    String choices = "[1]Start Game\n[2]Quit Game";
    String choice = "";

    public void getInput(String choice){
        this.choice = choice;
    }

    public void validateChoice(){
        if (choice.equals("1")){
            //Start the game
            System.out.println(1);
        }
        else if(choice.equals("2")){
            System.out.println("Goodbye!");
            System.exit(1);
        }
        else{
            System.out.println("Bad input.");
            getInput(simpleIO.getInput());
            validateChoice();
        }
    }

    public void showChoices() {
        System.out.println(choices);
    }
}
