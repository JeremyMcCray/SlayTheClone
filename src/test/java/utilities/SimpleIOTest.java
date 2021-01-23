package utilities;

import cards.UnitCard;
import models.Gobbo;
import models.Knight;
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