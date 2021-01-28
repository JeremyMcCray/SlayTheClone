package mapNodes.events;

import mapNodes.AbstractNode;
import models.Player;

public abstract class EventNode extends AbstractNode {
    private String eventName;
    private String description;

    public EventNode(Player player, String eventName, String description) {
        super(player);
        this.eventName = eventName;
        this.description = description;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDescription() {
        return description;
    }
}
