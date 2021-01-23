package cards.spellTargetedCards;

import cards.Card;

public abstract class SpellTargetedCard extends Card {
    public SpellTargetedCard(String name, int manaCost) {
        super(name,manaCost);
    }

    public void play(int position){}
}
