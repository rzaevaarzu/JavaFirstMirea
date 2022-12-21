package ru.mirea.task5;

import java.util.Scanner;

public class Task4
{
    static int get_nums_r(int k, int s, int digit, int sum){

        int needed = s - sum;

        if (needed < 0) return -2;

        if (digit == k) {
            if (needed > 9) {
                return 0;
            }
            return 1;
        }

        int total = 0;
        for (int i = digit == 1 ? 1 : 0; i <= 9; i++)
        {
            int result = get_nums_r(k, s, digit + 1, sum + i);

            if (result == -2) break;

            total += result;
        }

        return total;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();

        int count_r = get_nums_r(k, s, 1, 0);

        System.out.printf("Found %d nums", count_r);
        System.out.println();
    }
}

