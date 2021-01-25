package events;

import java.util.ArrayList;

public class PlayerStart extends Event {
    public PlayerStart() {
        super("Player Start");
        ArrayList<Event> staticEvents = new ArrayList<>();
        staticEvents.add(new PlayerTurnEnd)
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {

    }
}
