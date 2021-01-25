package events;

public class PlayerTurnStart extends Event {
    public PlayerTurnStart() {
        super("Player Start");
        this.addStaticAction(new PlayerTurnEnd());
    }

    @Override
    public void takeAction() {

    }
}
