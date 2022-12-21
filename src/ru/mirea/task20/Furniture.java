package ru.mirea.task20;

public abstract class Furniture
{
    private int price;
    private String name;

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Use the item of furniture.
     */
    public abstract void use();

    /**
     * Look at the item of furniture.
     */
    public abstract void lookAt();
}
