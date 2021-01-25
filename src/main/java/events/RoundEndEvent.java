package events;

import java.util.ArrayList;

public class RoundEndEvent extends Event{


    public RoundEndEvent() {
        //TODO fill in what the base listeners are
        super("RoundEndEvent", baseListeners);
    }

    @Override
    public void takeAction() {

    }
}
