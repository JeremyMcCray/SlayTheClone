package events;

import java.util.ArrayList;

public abstract class Event {
    private String label;

    private ArrayList<Event> staticActions; // all the static listeners attached to this event
    private ArrayList<Event> tempActions; // all the temporary actions(relics[?])
    private boolean isDone;

    public Event(String label) {
        this.label = label;
        this.tempActions = new ArrayList<>();
        isDone = false;
    }

    // Getters
    public String getLabel() {
        return label;
    }

    public ArrayList<Event> getStaticActions() {
        return staticActions;
    }

    public ArrayList<Event> getTempActions() {
        return tempActions;
    }

    public boolean isDone() {
        return isDone;
    }

    // setters
    public void setDone(boolean done) { isDone = done; }

    public void setStaticActions(ArrayList<Event> events) {
        this.staticActions = events;
    }

    public void setTempActions(ArrayList<Event> events) {
        this.tempActions = events;
    }

    // methods
    public void addStaticAction(Event e) { this.staticActions.add(e); }

    public void addTempAction(Event e) {
        this.tempActions.add(e);
    }

    public abstract void takeAction();
}
