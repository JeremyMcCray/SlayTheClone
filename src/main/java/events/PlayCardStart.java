package events;

import java.util.ArrayList;

public class PlayCardStart extends Event {

    public PlayCardStart() {
        //TODO fill in what the base listeners are
        super("Play Card Start");
        ArrayList<Event> staticEvents = new ArrayList<>();
        staticEvents.add(new PlayCardEnd());
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {

    }
}
