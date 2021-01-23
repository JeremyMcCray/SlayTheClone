package unitSpawning;

import cards.UnitCards.UnitCard;
import models.Player;

import java.util.ArrayList;

public class UnitSpawner {

    public ArrayList<UnitCard> getAllEnemiesForFloor(Player player, int floorNumber) {

        return unitSpawnerDecisionMaker(player, floorNumber);
    }

    private ArrayList<UnitCard> unitSpawnerDecisionMaker(Player player, int floorNumber) {
        return null;
    }
}
