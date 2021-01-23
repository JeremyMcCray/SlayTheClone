package cards.UnitCards;

public class GobboBoss extends UnitCard {
    static int gobboBossSpawnedSoFar = 0;

    public GobboBoss() {
        super("GobboBoss", 36, 5, 3, 1,"a bigger rat with 2 knives");
        //this is sloppy but i like it
        setMyUnitNumber(gobboBossSpawnedSoFar++);
    }

    @Override
    //GobboBoss has 2 knifes
    public void attack(UnitCard unitAttacked) {
        unitAttacked.takeDamage(this.getAttack()*2);
    }
}
