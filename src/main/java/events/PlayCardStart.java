package events;

public class PlayCardStart extends Event {
    public PlayCardStart() {
        //TODO fill in what the base listeners are
        super("Play Card Start");
        this.addStaticAction(new PlayCardEnd());
    }

    @Override
    public void takeAction() {

    }
}
