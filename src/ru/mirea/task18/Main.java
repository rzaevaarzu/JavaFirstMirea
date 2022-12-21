package ru.mirea.task18;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    /// Sum-mate an array via a for loop
    public static void task1()
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    /// Sum an array of ints using a while loop
    public static void task2()
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int i = 0;
        while (i < numbers.length)
        {
            sum += numbers[i];
            i++;
        }
        System.out.println(sum);
    }

    /// Sum an array of ints using a do-while loop
    public static void task3()
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int i = 0;
        do
        {
            sum += numbers[i];
            i++;
        } while (i < numbers.length);
        System.out.println(sum);
    }

    /// Print out arguments passed to the program in a for loop
    public static void task4(String[] args)
    {
        for (String arg : args)
        {
            System.out.println(arg);
        }
    }

    /// Print the first ten numbers of the harmonic series
    public static void task5()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(1.0 / i);
        }
    }

    /// Generate an array of random ints, print it, sort it and print it again
    public static void task6()
    {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    /// Calculate factorial of the provided number in a for loop
    public static int task7(int n)
    {
        int factorial = 1;
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args)
    {
        /// Print docs for each task from 1 to 7
        System.out.println("Task 1: Sum-mate an array via a for loop");
        System.out.println("Task 2: Sum an array of ints using a while loop");
        System.out.println("Task 3: Sum an array of ints using a do-while loop");
        System.out.println("Task 4: Print out arguments passed to the program in a for loop");
        System.out.println("Task 5: Print the first ten numbers of the harmonic series");
        System.out.println("Task 6: Generate an array of random ints, print it, sort it and print it again");
        System.out.println("Task 7: Calculate factorial of the provided number in a for loop");
        System.out.println("Exit: 0");
        System.out.print("Your input: ");

        /// Call taskN, where N is from the scanner
        Scanner scanner = new Scanner(System.in);
        int taskNumber = scanner.nextInt();
        while (taskNumber != 0)
        {
            switch (taskNumber)
            {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4(args);
                case 5 -> task5();
                case 6 -> task6();
                case 7 ->  {
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    System.out.println("Factorial of " + n + " is " + task7(n));

                    System.out.println("Tests: ");

                    System.out.println("Factorial of 1: " + task7(1) + ". Should be: " + "1");
                    System.out.println("Factorial of 2: " + task7(2) + ". Should be: " + "2");
                    System.out.println("Factorial of 3: " + task7(3) + ". Should be: " + "6");
                    System.out.println("Factorial of 4: " + task7(4) + ". Should be: " + "24");
                    System.out.println("Factorial of 5: " + task7(5) + ". Should be: " + "120");
                    System.out.println("Factorial of 6: " + task7(6) + ". Should be: " + "720");
                    System.out.println("Factorial of 7: " + task7(7) + ". Should be: " + "5040");
                }
                default -> System.out.println("No such task");
            }

            System.out.print("Your input: ");
            taskNumber = scanner.nextInt();
        }
    }
}
