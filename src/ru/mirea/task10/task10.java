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

public class Main
{

    public static void main(String[] args)
    {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        for (String shirt_serialized : shirts)
        {
            Shirt shirt = new Shirt(shirt_serialized);

            System.out.println(shirt);
            System.out.println();
        }
    }
}
