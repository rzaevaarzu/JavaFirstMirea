package ru.mirea.task14;


public class ChairFactory implements ChairAbstractFactory
{
    @Override
    public VictorianChair createVictorianChair()
    {
        return new VictorianChair(121);
    }

    @Override
    public FunctionalChair createFunctionalChair()
    {
        return new FunctionalChair();
    }

    @Override
    public MagicChair createMagicChair()
    {
        return new MagicChair();
    }
}
