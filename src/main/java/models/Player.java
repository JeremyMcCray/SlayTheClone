package models;

import cardHandling.Deck;
import cardHandling.Hand;

public class Player {

    Deck playerDeck;
    int mana;
    Hand hand;

    public Player(Deck playerDeck, int mana, Hand hand) {
        this.playerDeck = playerDeck;
        this.mana = mana;
        this.hand = hand;
    }
}
