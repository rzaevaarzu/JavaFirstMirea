package ru.mirea.task11;

public class Const implements Expression
{
    private final int value;

    public Const(int value)
    {
        this.value = value;
    }

    public int evaluate(int value)
    {
        return this.value;
    }

    public String toString()
    {
        return "" + value;
    }
}
