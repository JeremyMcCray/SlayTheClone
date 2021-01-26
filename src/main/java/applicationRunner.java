import menus.MainMenu;
import sun.applet.Main;
import utilities.SimpleIO;

public class applicationRunner {
    public static void main(String[] args) {
        SimpleIO simp = new SimpleIO();

        simp.introMessage();
        MainMenu mainMenu = new MainMenu();
        mainMenu.showChoices();
        String input = simp.getInput();
        mainMenu.getInput(input);
        mainMenu.validateChoice() ;


    }
}
