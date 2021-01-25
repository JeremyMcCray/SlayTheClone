package events;

public class AttackPhaseStart extends Event {
    public AttackPhaseStart() {
        super("Attack Phase");
        this.addStaticAction(new AttackPhaseEnd());
        this.addStaticAction(new EnemyAttack());
        this.addStaticAction(new PlayerAttack());
    }

    @Override
    public void takeAction() {

    }
}
