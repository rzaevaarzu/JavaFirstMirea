package ru.mirea.task21;

public class Animal implements Nameable
{
    private String name;
    private double weight;
    private double height;

    /// Returns an animal with a random weight and height, and with one of the five names.
    public Animal()
    {
        // Randomly choose a name from a list of five common russian cat names, translitted to english
        String[] names = {"Barsik", "Murzik", "Pushok", "Vaska", "Murka"};
        name = names[(int) (Math.random() * names.length)];
        weight = Math.random() * 100;
        height = Math.random() * 100;
    }

    /**
     * Constructs an animal with a given name, weight, and height.
     *
     * @param name   the name of the animal
     * @param weight the weight of the animal in kilograms
     * @param height the height of the animal in meters
     */
    public Animal(String name, double weight, double height)
    {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }


    public String getName()
    {
        return name;
    }

    public double getWeight()
    {
        return weight;
    }


    public double getHeight()
    {
        return height;
    }
}
