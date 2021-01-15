package models;

import cards.UnitCard;

public class Gobbo extends UnitCard {
    static int gobbosSpawnedSoFar = 0;

    public Gobbo() {
        super("Goblin", 4, 0, 1);
        //this is sloppy but i like it
        setMyUnitNumber(gobbosSpawnedSoFar++);
    }



}
