package models;

import cardHandling.Deck;
import cardHandling.Hand;

public class Player {

    private Deck playerDeck;
    private int mana;
    private Hand hand;

    public Player(Deck playerDeck, int mana, Hand hand) {
        this.playerDeck = playerDeck;
        this.mana = mana;
        this.hand = hand;
    }

    public Deck getPlayerDeck() {
        return playerDeck;
    }

    public int getMana() {
        return mana;
    }

    public Hand getHand() {
        return hand;
    }

    public int incManaBy1() {
        return mana++;
    }

    public int incMana(int inc) {
        return mana += inc;
    }
}
