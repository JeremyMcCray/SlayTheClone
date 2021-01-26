package prototype;

import cardHandling.Deck;
import cardHandling.Hand;
import models.Player;

public class PrototypePlayer extends Player {
    public PrototypePlayer() {
        super(new Deck(), 3, new Hand()); // Todo: change the deck and hand to be premade
    }
}
