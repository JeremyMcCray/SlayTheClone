package utilities;

import cardHandling.Deck;
import models.Battlefield;
import models.Event;
import models.EventManager;
import models.Player;

public class BattlefieldManager {
    Player userPlayer;
    Deck playerOnFieldDeck = userPlayer.getPlayerDeck();
    Player enemyPlayer;
    Battlefield battlefield;
    EventManager eventManager = new EventManager(roundStart());

    public BattlefieldManager(Player userPlayer, Player enemyPlayer, Battlefield battlefield) {
        this.userPlayer = userPlayer;
        this.enemyPlayer = enemyPlayer;
        this.battlefield = battlefield;
    }

    public Event roundStart(){
        return null;
    }
}
