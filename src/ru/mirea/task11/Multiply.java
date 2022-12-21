package ru.mirea.task11;

import java.util.Scanner;

public class Multiply extends BinaryOperation
{
    private final Expression left;
    private final Expression right;

    public Multiply(Expression left, Expression right)
    {
        super(left, right, "*");
        this.left = left;
        this.right = right;
    }

    public int evaluate(int value)
    {
        return left.evaluate(value) * right.evaluate(value);
    }
}

