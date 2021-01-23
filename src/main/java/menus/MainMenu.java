package menus;

import utilities.SimpleIO;

public class MainMenu {
    SimpleIO simpleIO = SimpleIO.getInstance();
    String choices = "[1]Start Game\n[2]Quit Game\n[3]Demo Mode";
    String choice = "";

    public void getInput(String choice) {
        this.choice = choice;
    }

    public void validateChoice() {
        switch (choice) {
            case "1":
                //Start the game
                System.out.println(1);
                break;
            case "2":
                System.out.println("Goodbye!");
                System.exit(1);
            case "3":
                System.out.println("Demo Mode");
                break;
            default:
                System.out.println("Bad input.");
                getInput(simpleIO.getInput());
                validateChoice();
                break;
        }
    }

    public void showChoices() {
        System.out.println(choices);
    }
}
