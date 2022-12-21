package ru.mirea.task19;

public class Torso
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
        System.out.println("Torso condition: " + condition);
    }

    public Torso(float condition)
    {
        this.condition = condition;
    }

    public Torso()
    {
        this.condition = 0;
    }
}

