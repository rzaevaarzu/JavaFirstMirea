package ru.mirea.task18;


import java.util.Scanner;

public class Task8 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in
        );
        String key = myScanner.next();
        int chance = 0;
        while (chance < 2) {
            try {
                printDetails(key);
                return;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                chance++;
            }
        }
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