package ru.mirea.task3;

public class Circle extends Shape
{
    protected double radius;
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public Circle()
    {
        this.filled = false;
        this.color = "orange";
        this.radius = 0.5;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString()
    {
        return String.format( "Circle: radius=%.2f, color=%s, filled=%s", radius, color, filled);
    }
}
