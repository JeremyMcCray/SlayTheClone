package game;

import events.EventManager;
import models.Player;
import utilities.BattlefieldManager;
import utilities.SimpleIO;

public abstract class Game {
    private EventManager eventManager;
    private BattlefieldManager battlefieldManager;
    private SimpleIO simpleIO;
    private Player player;
    private Player enemy;
    private boolean gameOver;

    public Game(Player player, Player enemy) {
        this.player = player;
        this.enemy = enemy;

        this.eventManager = new EventManager();
        this.battlefieldManager = new BattlefieldManager(this.player, this.enemy);
        this.simpleIO = new SimpleIO();
        this.gameOver = false;
    }

    public boolean advanceEvent() {
        if (!this.gameOver) {
            this.eventManager.next();
        }
        return this.gameOver;
    }
}
