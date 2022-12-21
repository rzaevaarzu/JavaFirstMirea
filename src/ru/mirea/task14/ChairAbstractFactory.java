package ru.mirea.task14;

/**
 * An abstract factory for any type of chair.
 */
public interface ChairAbstractFactory
{
    VictorianChair createVictorianChair();
    FunctionalChair createFunctionalChair();
    MagicChair createMagicChair();
}
