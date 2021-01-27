package menus;

import utilities.SimpleIO;

import java.util.ArrayList;
import java.util.HashMap;

public class MainMenu extends AbstractMenu {
    String currentCommand;

    public MainMenu(){
        initializeCommands();
    }

    @Override
    public void initializeCommands() {
        menuCommands = new HashMap<>();
        menuCommands.put("start game", MenuCommands.STARTGAME);
        menuCommands.put("exit game", MenuCommands.EXIT);
        menuCommands.put("demo mode",MenuCommands.DEMOMODE);

    }

    @Override
    // this needs work for validation
    public void processCommand(MenuCommands cmd) {
        //validateChoice();
    }

    // this needs work for validation
    public void processCommand(String cmd) {
        currentCommand = cmd;
        //processCommand(stringToCmd(cmd));
        validateChoice();

    }

    public void validateChoice() {
        switch (currentCommand) {
            case "Start Game":
                //Start the game

                System.out.println("I'm starting the game now");
                break;
            case "Exit Game":
                System.out.println("Im exiting the game now");
                System.exit(1);
            case "Demo Mode":
                System.out.println("Demo Mode Starting");
                break;
            default:
                processCommand(SimpleIO.getInstance().getStringInput("Bad input."));
                break;
        }
    }

}