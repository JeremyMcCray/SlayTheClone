package cardHandling;

import cards.Card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> handOfCards;

    public Hand(ArrayList<Card> handOfCards) {
        this.handOfCards = handOfCards;
    }

    public ArrayList<Card> getHandOfCards() {
        return handOfCards;
    }

    public Card getCardFromHand(int index){
       return handOfCards.get(index);
    }
}
