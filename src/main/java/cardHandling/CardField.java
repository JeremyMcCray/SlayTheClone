package cardHandling;

public class CardField {
    Deck deck;
    Deck graveYard;
    Deck discard;

    public CardField(Deck deck, Deck graveYard, Deck discard) {
        this.deck = deck;
        this.graveYard = graveYard;
        this.discard = discard;
    }

    public Deck getDeck() {
        return deck;
    }

    public Deck getGraveYard() {
        return graveYard;
    }

    public Deck getDiscard() {
        return discard;
    }
}
