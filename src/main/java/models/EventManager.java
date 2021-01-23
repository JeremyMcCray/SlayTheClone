package models;

import java.util.Stack;

public class EventManager {
    Stack<Event> eventStack;
    Event currentEvent;

    public EventManager(Event startingEvent) {
        eventStack = new Stack<>();
        currentEvent = startingEvent;
    }

    private void loadNextEvent() {
        currentEvent = eventStack.pop();
    }

    private void loadEventsIntoStack() {
//        for (int i = 0; i < currentEvent.baseListeners.size(); i++) {
//            eventStack.push(currentEvent.baseListeners.get(i));
//        }
//        for (int i = 0; i < currentEvent.addedListeners.size(); i++) {
//            eventStack.push(currentEvent.addedListeners.get(i));
//        }
//    }

//    public void next() {
//        loadNextEvent();
//        loadEventsIntoStack();
    }

    public Event getCurrentEvent() {
        return this.currentEvent;
    }

    public Event getNextEvent() {
        return this.eventStack.peek();
    }

    public Stack<Event> getEventStack() {
        return this.eventStack;
    }
}
