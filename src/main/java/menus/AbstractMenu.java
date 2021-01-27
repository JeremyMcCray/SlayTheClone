package menus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class AbstractMenu {

    protected Map<String, MenuCommands> menuCommands = new HashMap<>();

    public abstract void initializeCommands();

    public abstract void processCommand(MenuCommands cmd, ArrayList<String> args);

    public boolean commandExists(String cmd) {
        return this.menuCommands != null && this.menuCommands.containsKey(cmd.toLowerCase());
    }

    public void outputMenuChoices(){
        menuCommands.keySet().iterator().forEachRemaining(System.out::println);
    }

}
