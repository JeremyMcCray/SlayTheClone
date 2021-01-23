package cards.spellUntargetedCards;

import models.Player;

public class potOfGreed extends SpellUntargetedCard{

    public potOfGreed() {
        super("Pot-Of-Greed", 1, "Draw 2 Cards");
    }

    @Override
    public void play(Player playerEffected) {
        playerEffected.draw(2);
    }
}
