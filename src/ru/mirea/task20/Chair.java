package ru.mirea.task20;

public class Chair extends Furniture
{
    private int legs;
    private int height;

    public int getLegs()
    {
        return legs;
    }

    public void setLegs(int legs)
    {
        this.legs = legs;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public void use()
    {
        System.out.println("You sit in the chair.");
    }

    @Override
    public void lookAt()
    {
        System.out.println("You look at the chair.");
    }

    /// Return a verbose description of the chair with all fields.
    public String toString()
    {
        return "Chair: " + getName() + ". Price: " + getPrice() + ". Legs: " + getLegs() + ". Height: " + getHeight();
    }
}
