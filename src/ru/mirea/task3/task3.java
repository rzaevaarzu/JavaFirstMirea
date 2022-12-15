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

public class TestShape
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); // !!! Abstract Shape has no radius.

        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); // !!! Can't create new shape, since it's abstract.

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength()); // Abstract shape has no length

        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide()); // Abstract shape has no side

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide()); // Rectangle has no getSide
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

interface Movable {
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}
class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        System.out.println("\n[+] MovablePoint object was created");
    }

    public String toString() {
        return "MovablePoint object - x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
    }

    public void moveUp() {
        this.y += this.ySpeed;
        System.out.println("MovablePoint object moved up by " + this.ySpeed);
    }

    public void moveDown() {
        this.y -= this.ySpeed;
        System.out.println("MovablePoint object moved down by " + this.ySpeed);
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
        System.out.println("MovablePoint object moved left by " + this.xSpeed);
    }

    public void moveRight() {
        this.x += this.xSpeed;
        System.out.println("MovablePoint object moved right by " + this.xSpeed);
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1;
        }
        System.out.println("[+] MovableCircle object was created");
    }

    public String toString() {
        return "MovableCircle object - radius: " + this.radius + ", center: " + center;
    }

    public void moveUp() {
        this.center.moveUp();
        System.out.println("MovableCircle object moved up");
    }

    public void moveDown() {
        this.center.moveDown();
        System.out.println("MovableCircle object moved down");
    }

    public void moveLeft() {
        this.center.moveLeft();
        System.out.println("MovableCircle object moved left");
    }

    public void moveRight() {
        this.center.moveRight();
        System.out.println("MovableCircle object moved right");
    }
}
class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        System.out.println("[+] MovableRectangle object was created");
    }

    public String toString() {
        return "MovableRectangle object - topLeft: " + this.topLeft + ", bottomRight: " + this.bottomRight;
    }

    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
        System.out.println("MovableRectangle object moved up");
    }

    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
        System.out.println("MovableRectangle object moved down");
    }

    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
        System.out.println("MovableRectangle object moved left");
    }

    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
        System.out.println("MovableRectangle object moved right");
    }
}