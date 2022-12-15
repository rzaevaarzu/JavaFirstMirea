package ru.mirea.task11;

package ru.mirea.task11;

import java.util.Scanner;

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

public class Subtract extends BinaryOperation
{
    private final Expression left;
    private final Expression right;

    public Subtract(Expression left, Expression right)
    {
        super(left, right, "-");
        this.left = left;
        this.right = right;
    }

    public int evaluate(int value)
    {
        return left.evaluate(value) - right.evaluate(value);
    }
}


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



public class TestExpression
{
    public static void main(String[] args)
    {
        // request x from user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = in.nextInt();

        // Solve x^2-2x+1 for x
        Expression e = new Add(new Subtract(new Multiply(new Variable("x"), new Variable("x")), new Multiply(new Const(2), new Variable("x"))), new Const(1));
        System.out.println("Expression: " + e);
        checkExpression(e, x);

        System.out.println();
        System.out.println("Testing expression: ");

        // check e on a bunch of random values
        for (int i = 0; i < 10; i++)
        {
            int value = (int) (Math.random() * 1000);
            checkExpression(e, value);
        }
    }

    private static void checkExpression(Expression e, int x)
    {
        System.out.printf("x^2-2x+1 = %8d | ", e.evaluate(x));

        // check if result is correct
        if (e.evaluate(x) == x * x - 2 * x + 1)
        {
            // print in green
            System.out.println("\u001B[32mCorrect!");
        } else
        {
            // print in red
            System.out.println("\u001B[31mIncorrect!");
        }
    }
}

public interface Expression
{
    /**
     * @return the value of the expression
     */
    int evaluate(int x);
}
