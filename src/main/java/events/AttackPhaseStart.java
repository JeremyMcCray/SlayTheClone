package events;

import java.util.ArrayList;

public class AttackPhase extends Event {
    public AttackPhase() {
        super("Attack Phase");
        ArrayList<Event> staticEvents = new ArrayList<>();
        staticEvents.add(new AttackPhaseEnd());
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {

    }
}
