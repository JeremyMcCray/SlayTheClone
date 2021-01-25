package events;

import java.util.ArrayList;

public class EnemyTurnStart extends Event {
    public EnemyTurnStart() {
        super("Enemy Start");
        ArrayList<Event> staticEvents = new ArrayList<>();
        staticEvents.add(new EnemyTurnEnd());
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {

    }
}
