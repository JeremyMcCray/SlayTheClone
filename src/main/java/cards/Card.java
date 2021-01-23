package cards;

public abstract class Card {
    private final String name;
    private int manaCost;
    String description;

    public Card(String name, int manaCost, String description) {
        this.name = name;
        this.manaCost = manaCost;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        String output = "Name:"
                + "\n"
                + this.getName()
                + "\n ManaCost: "
                + this.getManaCost()
                + "\n Description: "
                + this.getDescription() +"\n" ;
        return output;
    }
}
