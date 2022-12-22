package ru.mirea.task22;

import java.awt.*;

public class Circle extends Shape
{
    private int radius;

    public Circle(int x, int y, Color color, int radius)
    {
        super(x, y, color);
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.fillOval(getX() - radius, getY() - radius, radius * 2, radius * 2);
    }
}
