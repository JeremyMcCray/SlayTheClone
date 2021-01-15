package models;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BattlefieldTest {

    Battlefield battlefield;
    @Before
    public void setUp() throws Exception {
        ArrayList<Unit> playerUnits = new ArrayList<>();
        ArrayList<Unit> enemyUnits = new ArrayList<>();
        playerUnits.add(new Knight());
        playerUnits.add(new Knight());
        enemyUnits.add(new Gobbo());
        enemyUnits.add(new Gobbo());
       battlefield = new Battlefield(playerUnits,enemyUnits);
    }

    @Test
    public void getEnemyFrontUnit() {
        Unit gobbo = battlefield.getEnemyFrontUnit();
        int actual = gobbo.myUnitNumber;
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void getEnemyFrontUnitNoUnit() {
        ArrayList<Unit> test1 = new ArrayList<>();
        ArrayList<Unit> test2 = new ArrayList<>();
        Battlefield test = new Battlefield(test1,test2);
        Unit unit = test.getEnemyFrontUnit();

        assertNull(unit);
    }


    @Test
    public void getPlayerFrontUnit() {
    }

    @Test
    public void placePlayerUnit() {
    }

    @Test
    public void placeEnemyUnit() {
    }
}