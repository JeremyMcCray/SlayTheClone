package cards.spellUntargetedCards;

import cards.Card;
import models.Player;

public abstract class SpellUntargetedCard extends Card {

    public SpellUntargetedCard(String name, int manaCost, String description) {
        super(name, manaCost, description);
    }

    public void play(Player playerEffected){}

}
