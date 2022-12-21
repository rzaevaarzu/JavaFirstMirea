package ru.mirea.task10;

public class Shirt
{
    String id;
    String type;
    String color;
    String size;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public Shirt()
    {
    }

    public Shirt(String id, String type, String color, String size)
    {
        this.id = id;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    /**
     * Constructs new shirt based on comma-separated string
     * @param shirt_serialized
     */
    public Shirt(String shirt_serialized) {
        String[] tokens = shirt_serialized.split(",", 0);
        this.id = tokens[0];
        this.type = tokens[1];
        this.color = tokens[2];
        this.size = tokens[3];
    }

    @Override
    public String toString()
    {
        return String.format("Shirt: \nID: %s \nType: %s \nColor: %s \nSize: %s", id, type, color, size);
    }
}

