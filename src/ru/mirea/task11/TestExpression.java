package ru.mirea.task11;


import java.util.Scanner;

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


