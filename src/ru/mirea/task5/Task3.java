package ru.mirea.task5;

import java.util.Scanner;

public class Task3
{

    public static void task3(int a, int b) {
        if (a < b) {
            System.out.println(a);
            task3(a+1, b);
        }
        else if (b < a) {
            System.out.println(a);
            task3(a-1, b);
        }
        else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        task3(A, B);
    }
}

