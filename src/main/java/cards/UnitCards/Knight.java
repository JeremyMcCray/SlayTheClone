package cards.UnitCards;

public class Knight extends UnitCard {

    int knightsSpawnedSoFar = 0;

    public Knight() {
        super("Knight", 10, 5, 4, 2,"A well armoured fighter");
        setMyUnitNumber(knightsSpawnedSoFar++);
    }

}
