package mapNodes;

import models.Player;

public abstract class AbstractNode {

    private static AbstractNode thisNode;
    private Player player;
    private AbstractNode nextNode;

    public AbstractNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public AbstractNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(AbstractNode nextNode) {
        this.nextNode = nextNode;
    }
}
