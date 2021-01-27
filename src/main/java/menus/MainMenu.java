package menus;

import utilities.SimpleIO;

import java.util.ArrayList;
import java.util.HashMap;

public class MainMenu extends AbstractMenu {
    String choices = "[1]Start Game\n[2]Quit Game\n[3]Demo Mode";
    String choice = "";

    public MainMenu(){
        initializeCommands();
    }

    @Override
    public void initializeCommands() {
        menuCommands = new HashMap<>();
        menuCommands.put("[1] Start Game", MenuCommands.STARTGAME);
        menuCommands.put("[2] Exit Game", MenuCommands.EXIT);
        menuCommands.put("[3] Demo Mode",MenuCommands.DEMOMODE);

    }

    @Override
    public void processCommand(MenuCommands cmd, ArrayList<String> args) {

    }

    public void validateChoice() {
        switch (choice) {
            case "1":
                //Start the game
                System.out.println(1);
                break;
            case "2":

                System.exit(1);
            case "3":
                System.out.println("Demo Mode");
                break;
            default:
                System.out.println("Bad input.");
                validateChoice();
                break;
        }
    }

    public void showChoices() {
        System.out.println(choices);
    }


}