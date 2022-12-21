package ru.mirea.task3;

public class Square extends Rectangle
{
    public Square()
    {
        this.width = 2;
        this.length = 2;
        this.color = "red";
        this.filled = false;
    }

    public Square(double side)
    {
        width = side;
        length = side;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public void setLength(double length) {
        this.width = length;
        this.length = length;
    }

    public Square(double side, String color, boolean filled)
    {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public double getArea()
    {
        return width * width;
    }

    @Override
    public double getPerimeter()
    {
        return width * 4;
    }

    @Override
    public String toString()
    {
        return String.format("Square: side=%.2f, color=%s, filled=%s", width, color, filled);
    }
}
