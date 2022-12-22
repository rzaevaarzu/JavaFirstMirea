package ru.mirea.task21;

public class Car implements Nameable
{
    private String name;
    private double fuelCapacity;
    private double fuelConsumption;

    /// Returns a car with random fuel capacity and fuel consumption, and with one of the five common car names.
    public Car()
    {
        // Randomly choose a name from a list of five common car names
        String[] names = {"Toyota", "Honda", "BMW", "Mercedes", "Audi"};
        name = names[(int) (Math.random() * names.length)];
        fuelCapacity = Math.random() * 100 + 20;
        fuelConsumption = Math.random() * 100 + 4;
    }

    public Car(String name, double fuelCapacity, double fuelConsumption)
    {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName()
    {
        return name;
    }

    public double getFuelCapacity()
    {
        return fuelCapacity;
    }

    public double getFuelConsumption()
    {
        return fuelConsumption;
    }
}
