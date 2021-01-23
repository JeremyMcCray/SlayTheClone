package models;

import java.util.ArrayList;

public abstract class Event {
    String label;
    ArrayList<Event> staticActions; // all the static listeners attached to this event
    ArrayList<Event> tempActions; // all the temporary actions(relics[?])

    public Event(String label, ArrayList<Event> baseListeners) {
        this.label = label;
        this.staticActions = baseListeners;
        this.tempActions = new ArrayList<>();
    }

    public void addTempListener(Event e) {
        this.tempActions.add(e);
    }

    public abstract void takeAction();
}

/*
    List of events:
    round start -> turn start
    turn start -> turn end, draw
 */
