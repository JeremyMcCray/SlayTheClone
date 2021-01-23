package cards.UnitCards;

public class GobboBoss extends UnitCard {
    static int gobboBossSpawnedSoFar = 0;

    public GobboBoss() {
        super("GoblinMaster", 36, 5, 3, 1);
        //this is sloppy but i like it
        setMyUnitNumber(gobboBossSpawnedSoFar++);

    }
}
