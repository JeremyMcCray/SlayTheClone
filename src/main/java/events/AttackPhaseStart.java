package events;

import java.util.ArrayList;

public class AttackPhaseStart extends Event {
    public AttackPhaseStart() {
        super("Attack Phase");
        ArrayList<Event> staticEvents = new ArrayList<>();
        staticEvents.add(new AttackPhaseEnd());
        staticEvents.add(new EnemyAttack());
        staticEvents.add(new PlayerAttack());
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {

    }
}
