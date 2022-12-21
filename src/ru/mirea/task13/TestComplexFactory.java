package ru.mirea.task13;

public class TestComplexFactory
{

    public static void main(String[] args) {

        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex num1 = factory.CreateComplex(25, 11);
        Complex num2 = factory.CreateComplex();
        Complex num3 = factory.CreateComplex(-1, -19);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
