package utilities;

import cards.UnitCards.UnitCard;
import cards.UnitCards.Gobbo;
import cards.UnitCards.Knight;
import org.junit.Test;
import java.util.ArrayList;


public class SimpleIOTest {

    SimpleIO test = new SimpleIO();

    @Test
    public void testUnitLister(){
        ArrayList<UnitCard> playerUnits = new ArrayList<>();
        ArrayList<UnitCard> enemyUnits = new ArrayList<>();
        playerUnits.add(new Knight());
        playerUnits.add(new Knight());
        enemyUnits.add(new Gobbo());
        enemyUnits.add(new Gobbo());

        test.outputListOfUnits(playerUnits);
        test.outputListOfUnits(enemyUnits);
    }

}