package ru.mirea.task5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;


public class Task2
{
    public static String printN(int n) {
        if (n == 1) {System.out.print(1);}
        else{
            System.out.print(" " + printN(n-1) + n);
        }
        return "";
    }
    public static void main(String[] args) {
        printN(8);
    }
}

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

public class Task6
{
    public static String task_6(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        if (n < 2) {
            return "NO";
        }
        else if (n == 2) {
            return "YES";
        }
        else if (n % i == 0) {
            return "NO";
        }
        else if (i < n / 2) {
            return task_6(n, i + 1);
        } else {
            return "YES";
        }
    }
}