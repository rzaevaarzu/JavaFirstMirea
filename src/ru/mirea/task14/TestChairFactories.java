package ru.mirea.task14;

public class TestChairFactories
{
    public static void main(String[] args)
    {
        ChairAbstractFactory f = new ChairFactory();

        Client client = new Client();

        Chair c = f.createVictorianChair();
        client.setChair(c);
        client.Sit();

        c = f.createFunctionalChair();
        client.setChair(c);
        client.Sit();

        c = f.createMagicChair();
        client.setChair(c);
        client.Sit();
    }
}
