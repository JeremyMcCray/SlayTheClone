package events;

import java.util.ArrayList;

public class EnemyTurnEndEvent extends Event{
    public EnemyTurnEndEvent() {
        //TODO fill in what the base listeners are
        super("EnemyTurnEndEvent", baseListeners);
    }

    @Override
    public void takeAction() {

    }
}
