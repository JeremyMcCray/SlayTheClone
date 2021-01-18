package models;

import java.util.ArrayList;
import java.util.Stack;

public class EventManager {
    Stack<Event> eventStack;
    ArrayList<Listener> listeners;
    Event currentEvent;

    public EventManager(Event startingEvent, ArrayList<Listener> startingListeners) {
        eventStack = new Stack<>();
        listeners = startingListeners;
        currentEvent = startingEvent;
    }

    public void addListener(Listener l) {
        this.listeners.add(l);
    }

    public void listen() {
        // TODO: iterate through listeners, checking to activate ones which react to current event
        return;
    }
}
