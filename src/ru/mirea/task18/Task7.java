package ru.mirea.task18;

import java.util.Scanner;

public class Task7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in
        );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }
        catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}