package ru.mirea.task5;

import java.util.Scanner;

public class Task5
{
    static int digit_sum(int n) {
        if (n == 0)
            return 0;

        return n % 10 + digit_sum(n / 10);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(digit_sum(N));

    }
}
