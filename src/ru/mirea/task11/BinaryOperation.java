package ru.mirea.task11;

public class BinaryOperation implements Expression
{
    private final Expression left;
    private final Expression right;
    private final String operator;

    public BinaryOperation(Expression left, Expression right, String operator)
    {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public int evaluate(int value)
    {
        return left.evaluate(value) * right.evaluate(value);
    }

    public String toString()
    {
        return "(" + left + " " + operator + " " + right + ")";
    }
}

