package models;

public class Knight extends Unit{

     int knightsSpawnedSoFar = 0;

    public Knight() {
        super("Knight", 15, 0, 4);
        myUnitNumber = knightsSpawnedSoFar++;
    }
}
