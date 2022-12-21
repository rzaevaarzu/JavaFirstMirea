package ru.mirea.task11;

public class Variable implements Expression
{
    private final String name;

    public Variable(String name)
    {
        this.name = name;
    }

    public int evaluate(int value)
    {
        return value;
    }

    public String toString()
    {
        return name;
    }
}


