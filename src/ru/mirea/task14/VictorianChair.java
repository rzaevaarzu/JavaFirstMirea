package ru.mirea.task14;

/**
 * A victorian-era-style chair.
 */
public class VictorianChair implements Chair
{
    private int age;

    public int getAge() {
        return age;
    }

    public VictorianChair(int age)
    {
        this.age = age;
    }

    @Override
    public void Sit()
    {
        System.out.println("You are sitting on a victorian chair.");
    }
}
