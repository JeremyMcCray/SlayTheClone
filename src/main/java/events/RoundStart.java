package events;

import java.util.ArrayList;

public class RoundStart extends Event{
    public RoundStart() {
        super("Round Start");
        this.addStaticAction(new EnemyTurnStart());
        this.addStaticAction(new PlayerTurnStart());
        this.addStaticAction(new AttackPhaseStart());
    }

    @Override
    public void takeAction() {}
}
