package ru.mirea.task19;

public class Hand
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
        System.out.println("Hand condition: " + condition);
    }

    public Hand(float condition)
    {
        this.condition = condition;
    }

    public Hand()
    {
        this.condition = 0;
    }

    /**
     * Print a message about moving the hand
     */
    public void move() {
        System.out.println("Moving hand");
    }

    /**
     * Print a message about grabbing
     */
    public void grab() {
        System.out.println("Grabbing...");
    }
}
