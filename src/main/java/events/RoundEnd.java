package events;

import java.util.ArrayList;

public class RoundEnd extends Event{
    public RoundEnd() {
        super("Round End");
        this.addStaticAction(new RoundStart());
    }

    @Override
    public void takeAction() {

    }
}
