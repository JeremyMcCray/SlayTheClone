package cards.UnitCards;

import cards.Card;
import utilities.SimpleIO;

public abstract class UnitCard extends Card {
    SimpleIO io = SimpleIO.getInstance();

    int health;
    int shields;
    int attack;
    int myUnitNumber;

    public UnitCard(String name, int health, int shields, int attack, int manaCost) {
        super(name,manaCost);
        this.health = health;
        this.shields = shields;
        this.attack = attack;
    }

    public int takeDamage(int damage) {
        if (!checkForShields(damage)) {
            this.health -= damage;
        }

        return this.health;
    }

    public boolean checkForShields(int damage) {
        if (shields > 0) {
            damageShields(damage);
            return true;
        } else {
            return false;
        }
    }

    private void damageShields(int damage) {
        this.shields -= damage;
    }

    public void setMyUnitNumber(int myUnitNumber) {
        this.myUnitNumber = myUnitNumber;
    }

    public int getMyUnitNumber() {
        return myUnitNumber;
    }

    public int getHealth() {
        return health;
    }

    public int getShields() {
        return shields;
    }

    public int getAttack() {
        return attack;
    }

    @Override
    public String toString() {
        return this.getName() + "\n Health: "
                + this.getHealth() +
                "\n Shields: "
                + this.getShields()
                + "\n Attack: "
                + this.getAttack()
                + "\n ManaCost: "
                + this.getManaCost()+"\n";
    }

    public void play(){}
}
