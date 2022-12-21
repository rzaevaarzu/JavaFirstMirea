package ru.mirea.task16;

/**
 * A bar drink. Immutable.
 */
public class Drink implements Item
{
    private final String name;
    private final double price;
    private final String description;

    /**
     * @param name the name of the drink
     * @param price the price of the drink
     * @param description the description of the drink
     */
    public Drink(String name, double price, String description)
    {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    /**
     * @param name the name of the drink
     * @param description the description of the drink
     */
    public Drink(String name, String description)
    {
        this.price = 0;
        this.name = name;
        this.description = description;
    }

    /**
     * @return the name of the drink
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the price of the drink
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * @return the description of the drink
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return a string representation of the drink
     */
    public String toString()
    {
        return name + " (" + price + " USD): " + description;
    }
}
