package utilities;

import cardHandling.Hand;
import cards.Card;
import cards.UnitCards.UnitCard;
import cards.UnitCards.Gobbo;
import cards.UnitCards.Knight;
import cards.spellTargetedCards.SpellTargetedCard;
import cards.spellTargetedCards.fireBall;
import menus.MainMenu;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class SimpleIOTest {

    SimpleIO test = new SimpleIO();
    List<Card> playerCards = new ArrayList<>();
    List<Card> enemyCards = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        playerCards.add(new Knight());
        playerCards.add(new Knight());
        enemyCards.add(new Gobbo());
        enemyCards.add(new Gobbo());

    }



    @Test
    public void testUnitLister(){
       // test.outputListOfUnits(playerCards);
       // test.outputListOfUnits(enemyCards);
    }

    @Test
    public void outputListOfCards() {
        SpellTargetedCard fireball = new fireBall();
        playerCards.add(fireball);

        Hand hand = new Hand((ArrayList<Card>) playerCards);
        test.outputListOfCards(hand.getHandOfCards());
    }

    @Test
    public void outputMenuChoices(){
        MainMenu menu = new MainMenu();
        menu.outputMenuChoices();
    }
}