package ru.mirea.task5;

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

