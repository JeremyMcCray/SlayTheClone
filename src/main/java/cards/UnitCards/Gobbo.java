package cards.UnitCards;

public class Gobbo extends UnitCard {
    static int gobbosSpawnedSoFar = 0;

    public Gobbo() {
        super("Goblin", 6, 1, 1, 1);
        //this is sloppy but i like it
        setMyUnitNumber(gobbosSpawnedSoFar++);
    }



}
