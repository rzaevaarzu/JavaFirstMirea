package ru.mirea.task18;

class Throws {
    public void getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
            System.out.println("Your key is: " + key);
        }
        catch (NullPointerException ex){
            printMessage(ex);
        }
    }

    private void printMessage(Exception ex){
        System.out.println(ex.getMessage());
    }

    public static void main(String[] args) {
        Throws thr = new Throws();
        thr.getDetails("Key");
        thr.getDetails(null);
    }
}