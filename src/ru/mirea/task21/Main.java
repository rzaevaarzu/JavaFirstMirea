package ru.mirea.task21;

public class Main {

    public static void main(String[] args) {
        // Create an array of nameable objects, where 5 of them are animals, 5 are cars, and 5 are planets
        Nameable[] nameables = new Nameable[15];
        for (int i = 0; i < nameables.length; i++)
        {
            if (i < 5)
            {
                nameables[i] = new Animal();
            }
            else if (i < 10)
            {
                nameables[i] = new Car();
            }
            else
            {
                nameables[i] = new Planet();
            }
        }

        // Print the names of the nameables, after every fifth name, print a new line
        for (int i = 0; i < nameables.length; i++)
        {
            System.out.print(nameables[i].getName() + " ");
            if (i % 5 == 4)
            {
                System.out.println();
            }
        }
    }
}
