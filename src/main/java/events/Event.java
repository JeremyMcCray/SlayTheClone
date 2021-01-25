package events;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Event {
    String label;
    ArrayList<Event> staticActions; // all the static listeners attached to this event
    ArrayList<Event> tempActions; // all the temporary actions(relics[?])

    public Event(String label) {
        this.label = label;
        this.tempActions = new ArrayList<>();
    }

    public void setStaticActions(ArrayList<Event> events) {
        this.staticActions = events;
    }

    public void setTempActions(ArrayList<Event> events) {
        this.tempActions = events;
    }

    public void addStaticAction(Event e) { this.staticActions.add(e); }

    public void addTempAction(Event e) {
        this.tempActions.add(e);
    }

    public abstract void takeAction();
}
