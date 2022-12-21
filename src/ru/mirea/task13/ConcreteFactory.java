package ru.mirea.task13;

public class ConcreteFactory implements ComplexAbstractFactory
{
    @Override
    public Complex CreateComplex()
    {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int imaginary)
    {
        return new Complex(real, imaginary);
    }
}
