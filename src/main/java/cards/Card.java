package cards;

public abstract class Card {
    private final String name;
    private int manaCost;
    public Card(String name,int manaCost) {
        this.name = name;
        this.manaCost = manaCost;
    }

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }
}
