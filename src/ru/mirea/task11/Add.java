package ru.mirea.task11;

public class Add extends BinaryOperation
{
    private final Expression left;
    private final Expression right;

    public Add(Expression left, Expression right)
    {
        super(left, right, "+");
        this.left = left;
        this.right = right;
    }

    public int evaluate(int value)
    {
        return left.evaluate(value) + right.evaluate(value);
    }
}