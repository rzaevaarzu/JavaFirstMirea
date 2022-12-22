package ru.mirea.task21;

public class Planet implements Nameable
{
    private String name;
    private double mass;
    private double radius;

    /// Returns a planet with random mass (not lower than 500000) and radius (not lower than 5000), and with one of the predefined names.
    public Planet()
    {
        // Randomly choose a name from a list of 9 futuristic planet names
        String[] names = {"Alderaan", "Bespin", "Coruscant", "Dagobah", "Endor", "Hoth", "Kamino", "Naboo", "Tatooine"};

        name = names[(int) (Math.random() * names.length)];
        mass = Math.random() * 100000 + 500000;
        radius = Math.random() * 10000 + 5000;
    }

    public Planet(String name, double mass, double radius)
    {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public String getName()
    {
        return name;
    }

    public double getMass()
    {
        return mass;
    }

    public double getRadius()
    {
        return radius;
    }
}
