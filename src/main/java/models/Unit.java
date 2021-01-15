package models;

public abstract class Unit {
    String name;
    int health;
    int shields;
    int attack;
    int myUnitNumber;

    public Unit(String name, int health, int shields, int attack) {
        this.name = name;
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

    private void damageShields(int damage){
        this.shields -= damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMyUnitNumber() {
        return myUnitNumber;
    }
}
