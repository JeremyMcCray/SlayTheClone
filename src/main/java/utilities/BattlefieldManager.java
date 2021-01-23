package utilities;

import cardHandling.Deck;
import models.Battlefield;
import models.Event;
import models.EventManager;
import models.Player;

public class BattlefieldManager {
    Player userPlayer;
    Deck playerOnFieldDeck ;
    Player enemyPlayer;
    Battlefield battlefield;
    EventManager eventManager = new EventManager();

    public BattlefieldManager(Player userPlayer, Player enemyPlayer, Battlefield battlefield) {
        this.userPlayer = userPlayer;
        this.enemyPlayer = enemyPlayer;
        this.battlefield = battlefield;
        playerOnFieldDeck = userPlayer.getPlayerDeck();
    }


}
