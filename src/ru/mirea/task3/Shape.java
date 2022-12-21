package ru.mirea.task3;

public abstract class Shape
{
    protected String color;
    public String getColor()
    {
        return color;
    }
    public void setColor(String newColor)
    {
        color = newColor;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean newFilledState)
    {
        filled = newFilledState;
    }
    protected boolean filled;
    public Shape()
    {
        color = "NO_COLOR";
    }
    public Shape(String _color, boolean _filled)
    {
        color = _color;
        filled = _filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString()
    {
        return "Shape";
    }
}
