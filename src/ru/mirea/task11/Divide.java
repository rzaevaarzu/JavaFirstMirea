package ru.mirea.task11;

public class Divide extends BinaryOperation
{
    private final Expression left;
    private final Expression right;

    public Divide(Expression left, Expression right)
    {
        super(left, right, "/");
        this.left = left;
        this.right = right;
    }

    public int evaluate(int value)
    {
        return left.evaluate(value) / right.evaluate(value);
    }
}
