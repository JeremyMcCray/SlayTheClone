package cards.spellTargetedCards;

import cards.Card;
import models.Player;

public abstract class SpellTargetedCard extends Card {
    public SpellTargetedCard(String name, int manaCost,String description) {
        super(name,manaCost, description);
    }

    public void play(int position, Player playerEffected){}
}
