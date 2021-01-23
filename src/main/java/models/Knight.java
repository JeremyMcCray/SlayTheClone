package models;

import cards.UnitCard;

public class Knight extends UnitCard {

    int knightsSpawnedSoFar = 0;

    public Knight() {
        super("Knight", 15, 0, 4);
        setMyUnitNumber(knightsSpawnedSoFar++);
    }

}
