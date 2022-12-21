package ru.mirea.task3;

public class Rectangle extends Shape
{
    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    protected double width;

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    protected double length;

    public Rectangle()
    {
        this.width = 1;
        this.length = 2;
        this.color = "blue";
        this.filled = false;
    }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public double getArea()
    {
        return width * length;
    }

    @Override
    public double getPerimeter()
    {
        return (width + length) * 2;
    }

    @Override
    public String toString()
    {
        return String.format("Rectangle: width=%.2f, length=%.2f, color=%s, filled=%s", width, length, color, filled);
    }
}
