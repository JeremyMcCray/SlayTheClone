package events;

import java.util.ArrayList;

public class EnemyAttackEvent extends Event {

    public EnemyAttackEvent() {
        //TODO fill in what the base listeners are
        super("EnemyAttackEvent", baseListeners);
    }

    @Override
    public void takeAction() {

    }
}
