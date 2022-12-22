package ru.mirea.task18.Task3;

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

public class Task3 {
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        try {
            exception2.exceptionDemo();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
