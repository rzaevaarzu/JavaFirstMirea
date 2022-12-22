package ru.mirea.task22;

import java.awt.*;

public class Rectangle extends Shape
{
    private int width;
    private int height;

    public Rectangle(int x, int y, Color color, int width, int height)
    {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), width, height);
    }
}
