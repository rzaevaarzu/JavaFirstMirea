package ru.mirea.task18;

class Exception1 {
    public void exceptionDemo() {
        System.out.println( 2 / 0 );
    }
}

class Exception2 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}
class Task1 {
    public static void main(String[] args) {
        Exception2 ex2 = new Exception2();
        ex2.exceptionDemo();

        Exception1 ex = new Exception1();
        ex.exceptionDemo(); //программа даст сбой, и вы получите следующее сообщение java.lang.ArithmeticException: / by zero at
    }
}