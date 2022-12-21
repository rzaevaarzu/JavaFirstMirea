package ru.mirea.task3;


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