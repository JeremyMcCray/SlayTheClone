package cardHandling;

import cards.Card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> handOfCards;

    public Hand(ArrayList<Card> handOfCards) {
        this.handOfCards = handOfCards;
    }

    public Hand() {
        this.handOfCards = new ArrayList<Card>();
    }

    public ArrayList<Card> getHandOfCards() {
        return handOfCards;
    }

    public Card getCardFromHand(int index){
       return handOfCards.get(index);
    }

    public void addCardToHand(Card card){
        handOfCards.add(card);
    }
}
