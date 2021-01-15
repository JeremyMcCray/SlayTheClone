package cardHandling;

import cards.Card;

import java.util.ArrayList;

public class Deck {

    ArrayList<Card> deckOfCards;

    public void addCardToDeck(Card card) {
        deckOfCards.add(card);
    }

    public Card drawCard(int index) {
        if (index < deckOfCards.size()) {
            return deckOfCards.remove(index);
        }
        return null;
    }

    public Card drawTopCard() {
        if (deckOfCards.size() > 0) {
            //using remove draws the card from the deck.
            return deckOfCards.remove(0);
        }
        return null;
    }
}
