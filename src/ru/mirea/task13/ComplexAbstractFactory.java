package ru.mirea.task13;

/**
 * An abstract factory that creates complex numbers
 */
public interface ComplexAbstractFactory
{
    Complex CreateComplex();

    Complex CreateComplex(int real, int imaginary);
}
