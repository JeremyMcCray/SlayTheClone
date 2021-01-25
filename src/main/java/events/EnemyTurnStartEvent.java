package events;

import java.util.ArrayList;

public class EnemyTurnStartEvent extends Event{

    public EnemyTurnStartEvent() {
        //TODO fill in what the base listeners are
        super("EnemyTurnEndEvent", baseListeners);
    }

    @Override
    public void takeAction() {

    }
}
