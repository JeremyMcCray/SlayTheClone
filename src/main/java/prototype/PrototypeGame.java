package prototype;

import game.Game;

public class PrototypeGame extends Game {
    public PrototypeGame() {
        super(new PrototypePlayer(), new PrototypeEnemy());
    }
}
