package events;

import java.util.ArrayList;

public class RoundEnd extends Event{
    public RoundEnd() {
        super("Round End");
        ArrayList<Event> staticEvents = new ArrayList<>();
        staticEvents.add(new RoundStart());
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {

    }
}
