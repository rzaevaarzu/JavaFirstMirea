package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        factTask();
    }

    private static void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number of elements in");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Type elements in");
        for(int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        int sum1 = 0;
        for(int i = 0; i < n; i++)
            sum1 += arr[i];
        System.out.println(sum1);

        int sum2 = 0;
        int i = 0;
        while (i < n) {
            sum2+=arr[i];
            i++;
        }
        System.out.println(sum2);

        int sum3 = 0;
        i = 0;
        do {
            sum3+=arr[i];
            i++;
        } while(i < n);
        System.out.println(sum3);
    }

    private static void printStringArray(String[] arr) {
        for(var str: arr) {
            System.out.println(str);
        }
    }

    private static void harmonicSeries() {
        for(int i = 1; i < 11; i++)
            System.out.printf("%f ", 1./i);
    }

    private static void bubbleSort(int[] arr) {
        int c;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    c = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = c;
                }
            }
        }
    }
    private static void pseudoRandom() {
        System.out.println("Array size: ");
        int size = new Scanner(System.in).nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++)
            array[i] = (int) (Math.random() * 1000);

        System.out.println(Arrays.toString(array));

        bubbleSort(array);

        System.out.println(Arrays.toString(array));

        Random random = new Random();
        for(int i = 0; i < size; i++)
            array[i] = random.nextInt();

        System.out.println(Arrays.toString(array));

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
    private static void factTask() {
        int n = new Scanner(System.in).nextInt();
        System.out.println(factorial(n));
    }
}
