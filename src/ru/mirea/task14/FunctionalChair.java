package ru.mirea.task14;

/**
 * A functional chair.
 */
public class FunctionalChair implements Chair
{
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void Sit()
    {
        System.out.println("You are sitting on a multifunctional chair.");
    }
}
