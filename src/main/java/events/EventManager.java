package events;

import java.util.Stack;

public class EventManager {
    Stack<Event> eventStack;
    Event currentEvent;

    public EventManager() {
        eventStack = new Stack<>();
    }

    private void loadNextEvent() {
        currentEvent = eventStack.pop();
    }

    private void loadEventsIntoStack() {
        for (int i = 0; i < currentEvent.getStaticActions().size(); i++) {
            eventStack.push(currentEvent.getStaticActions().get(i));
        }
        for (int i = 0; i < currentEvent.getTempActions().size(); i++) {
            eventStack.push(currentEvent.getTempActions().get(i));
        }
    }

    public void next() {
        loadNextEvent();
        loadEventsIntoStack();
        runCurrentEvent();
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

    private void runCurrentEvent() {
        currentEvent.takeAction();
    }

    public void addEvent(Event event) {
        this.currentEvent = event;
    }
}
