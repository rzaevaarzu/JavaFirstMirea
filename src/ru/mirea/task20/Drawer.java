package ru.mirea.task20;

public class Drawer extends Furniture
{
    private int width;
    private int height;
    private int depth;

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getDepth()
    {
        return depth;
    }

    public void setDepth(int depth)
    {
        this.depth = depth;
    }

    @Override
    public void use()
    {
        System.out.println("You open the drawer.");
    }

    @Override
    public void lookAt()
    {
        System.out.println("You look at the drawer.");
    }

    /// Return a verbose description of the drawer with all fields.
    public String toString()
    {
        return "Drawer: " + getName() + ". Price: " + getPrice() + ". Dimensions(WxHxD): " + getWidth() + "x" + getHeight() + "x" + getDepth();
    }
}
