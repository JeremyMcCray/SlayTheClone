package models;

public class Gobbo extends Unit{
    static int gobbosSpawnedSoFar = 0;

    public Gobbo() {
        super("Goblin", 4, 0, 1);
        //this is sloppy but i like it
        myUnitNumber = gobbosSpawnedSoFar++;
    }


}
