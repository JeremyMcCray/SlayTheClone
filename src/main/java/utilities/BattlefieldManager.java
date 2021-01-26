package utilities;

import cardHandling.Deck;
import cards.UnitCards.UnitCard;
import models.Battlefield;
import events.EventManager;
import models.Player;

import java.util.ArrayList;

public class BattlefieldManager {
    Player userPlayer;
    Deck playerOnFieldDeck;
    Player enemyPlayer;
    Battlefield battlefield;
    EventManager eventManager = new EventManager();

    public BattlefieldManager(Player userPlayer, Player enemyPlayer, Battlefield battlefield) {
        this.userPlayer = userPlayer;
        this.enemyPlayer = enemyPlayer;
        this.battlefield = battlefield;
        playerOnFieldDeck = userPlayer.getPlayerDeck();
    }

    public BattlefieldManager(Player userPlayer, Player enemyPlayer) {
        this.userPlayer = userPlayer;
        this.enemyPlayer = enemyPlayer;
        this.battlefield = new Battlefield(new ArrayList<UnitCard>(), new ArrayList<UnitCard>());
    }
}
