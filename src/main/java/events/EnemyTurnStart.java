package events;

import java.util.ArrayList;

public class EnemyStart extends Event {
    public EnemyStart() {
        super("Enemy Start");
        ArrayList<Event> staticEvents = new ArrayList<>();
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {

    }
}
