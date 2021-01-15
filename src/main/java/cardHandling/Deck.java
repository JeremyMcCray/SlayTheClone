package models;

import cards.Card;

import java.util.ArrayList;

public class Deck {

    ArrayList<Card> deckOfCards;

    public void addCardToDeck(Card card){
        deckOfCards.add(card);
    }

    public Card drawCard(int index) {
        if (index < deckOfCards.size()) {
            return deckOfCards.get(index);
        }
        return null;
    }
}
