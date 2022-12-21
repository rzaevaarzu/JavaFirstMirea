package ru.mirea.task20;

public class Table extends Furniture
{
    private int legs;
    private int width;
    private int length;

    public int getLegs()
    {
        return legs;
    }

    public void setLegs(int legs)
    {
        this.legs = legs;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    @Override
    public void use()
    {
        System.out.println("You sit at the table.");
    }

    @Override
    public void lookAt()
    {
        System.out.println("You look at the table.");
    }

    /// Return a verbose description of the table with all fields.
    public String toString()
    {
        return "Table: " + getName() + ". Price: " + getPrice() + ". Legs: " + getLegs() + ". Dimensions(WxL): " + getWidth() + "x" + getLength();
    }
}
