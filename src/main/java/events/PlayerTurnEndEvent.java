package events;

import java.util.ArrayList;

public class PlayerTurnEndEvent extends Event{

    public PlayerTurnEndEvent() {
        //TODO fill in what the base listeners are
        super("PlayerTurnEndEvent", baseListeners);
    }

    @Override
    public void takeAction() {

    }
}
