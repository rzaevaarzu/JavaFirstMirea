package ru.mirea.task18.Task2;

import java.util.Scanner;
class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }
}

public class Task2 {
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        try {
            exception2.exceptionDemo();
        }
        catch (NumberFormatException | ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }

    //При Qwerty - NumberFormatException
    //При 0 - ArithmeticException
    //При 1.2 - NumberFormatException
    //При 1. - NumberFormatException
}