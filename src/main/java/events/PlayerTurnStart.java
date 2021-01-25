package events;

import java.util.ArrayList;

public class PlayerTurnStart extends Event {
    public PlayerTurnStart() {
        super("Player Start");
        ArrayList<Event> staticEvents = new ArrayList<>();
        staticEvents.add(new PlayerTurnEnd)
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {

    }
}
