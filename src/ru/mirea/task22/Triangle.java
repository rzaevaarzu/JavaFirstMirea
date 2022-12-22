package ru.mirea.task22;

import java.awt.*;

public class Triangle extends Shape
{
    private int width;
    private int height;

    public Triangle(int x, int y, Color color, int width, int height)
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
        g.fillPolygon(new int[] {getX(), getX() + width, getX() + width / 2},
                new int[] {getY(), getY(), getY() + height},
                3);
    }
}
