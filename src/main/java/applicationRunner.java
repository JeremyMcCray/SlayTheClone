import menus.MainMenu;
import sun.applet.Main;
import utilities.SimpleIO;

public class applicationRunner {
    public static void main(String[] args) {
        SimpleIO simp = new SimpleIO();
        MainMenu mainMenu = new MainMenu();


        mainMenu.outputMenuChoices();

        mainMenu.processCommand(simp.getStringInput());

    }
}
