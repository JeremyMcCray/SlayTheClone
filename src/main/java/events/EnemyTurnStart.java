package events;

public class EnemyTurnStart extends Event {
    public EnemyTurnStart() {
        super("Enemy Start");
        this.addStaticAction(new EnemyTurnEnd());
    }

    @Override
    public void takeAction() {

    }
}
