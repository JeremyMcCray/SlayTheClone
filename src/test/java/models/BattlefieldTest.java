package models;

import cards.UnitCard;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BattlefieldTest {


    @Test
    public void getEnemyFrontUnit() {
        ArrayList<UnitCard> playerUnits = new ArrayList<>();
        ArrayList<UnitCard> enemyUnits = new ArrayList<>();
        playerUnits.add(new Knight());
        playerUnits.add(new Knight());
        enemyUnits.add(new Gobbo());
        enemyUnits.add(new Gobbo());
        Battlefield battlefield = new Battlefield(playerUnits, enemyUnits);

        UnitCard gobbo = battlefield.getEnemyFrontUnit();
        int actual = gobbo.getMyUnitNumber();
        int expected = 0;
        System.out.println(battlefield.toString());
        assertEquals(expected, actual);
    }

    @Test
    public void getEnemyFrontUnitNoUnit() {
        ArrayList<UnitCard> test1 = new ArrayList<>();
        ArrayList<UnitCard> test2 = new ArrayList<>();
        Battlefield test = new Battlefield(test1, test2);
        UnitCard unit = test.getEnemyFrontUnit();


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