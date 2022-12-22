package ru.mirea.task18;

public class Task5 {
    public void getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}