package events;

import java.util.ArrayList;

public class RoundStart extends Event{
    public RoundStart() {
        super("Round Start");
        ArrayList<Event> staticEvents = new ArrayList<>();
        staticEvents.add(new EnemyTurnStart());
        staticEvents.add(new PlayerTurnStart());
        staticEvents.add(new AttackPhaseStart());
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {}
}
