package models;

public abstract class AttackCard extends Card{
    public AttackCard(String name) {
        super(name);
    }

    public void basicAttack(Unit unit,int damage){
        unit.takeDamage(damage);
    }
}
