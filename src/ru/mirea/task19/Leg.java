package ru.mirea.task19;

public class Leg
{
    float condition;

    public float getCondition()
    {
        return condition;
    }

    public void setCondition(float condition)
    {
        this.condition = condition;
    }

    public void printCondition()
    {
        System.out.println("Leg condition: " + condition);
    }

    public Leg(float condition)
    {
        this.condition = condition;
    }

    public Leg()
    {
        this.condition = 0;
    }

    /**
     * Print a message about moving the leg
     */
    public void move() {
        System.out.println("Moving leg");
    }
}

