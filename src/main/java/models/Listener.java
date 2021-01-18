package models;

import java.util.ArrayList;

public class Listener {
    // the listener class should externally be put in a group with
    ArrayList<Event> eventDump; // the events which will be dumped into the event stack on trigger

    public Listener(Event trigger, ArrayList<Event> eventDump) {
        this.eventDump = eventDump;
    }
}
