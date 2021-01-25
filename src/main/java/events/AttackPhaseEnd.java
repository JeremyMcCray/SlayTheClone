package events;
import java.util.ArrayList;

public class AttackPhaseEnd extends Event {
    public AttackPhaseEnd() {
        super("Attack Phase End");
        this.addStaticAction(new RoundEnd());
    }

    @Override
    public void takeAction() {

    }
}
