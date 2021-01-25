package events;
import java.util.ArrayList;

public class AttackPhaseEnd extends Event {
    public AttackPhaseEnd() {
        super("Attack Phase End");
        ArrayList<Event> staticEvents = new ArrayList<>();
        staticEvents.add(new RoundEnd());
        this.setStaticActions(staticEvents);
    }

    @Override
    public void takeAction() {

    }
}
