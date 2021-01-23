package models;

import java.util.ArrayList;

public class Event {
    String label;
    ArrayList<Event> baseListeners; // all the static listeners attached to this event
    ArrayList<Event> addedListeners; // all the temporary added listeners

    public Event(String label, ArrayList<Event> baseListeners) {
        this.label = label;
        this.baseListeners = baseListeners;
        this.addedListeners = new ArrayList<>();
    }

    public void addListener(Event e) {
        this.addedListeners.add(e);
    }
}

/*
    List of events:
    round start -> turn start
    turn start -> turn end, draw
 */
