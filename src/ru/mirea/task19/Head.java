package ru.mirea.task19;

public class Head
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
        System.out.println("Head condition: " + condition);
    }

    public Head(float condition)
    {
        this.condition = condition;
    }

    public Head()
    {
        this.condition = 0;
    }

    /**
     * Print a message about moving the head
     */
    public void move()
    {
        System.out.println("Moving head");
    }

    /** Print a message about thinking
     *
     */
    public void think() {
        System.out.println("Thinking...");
    }
}
