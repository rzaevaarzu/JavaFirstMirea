package ru.mirea.task14;


/**
 * A magic chair.
 */
public class MagicChair implements Chair
{
    public void doMagic() {
        System.out.println("The magic chair flies...");
    }

    @Override
    public void Sit()
    {
        System.out.println("You are sitting on a magic chair.");
    }
}
