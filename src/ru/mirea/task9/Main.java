package ru.mirea.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО и ИНН >> ");
        String last, firts, middleName;
        String INN;
        last = scanner.next();
        firts = scanner.next();
        middleName = scanner.next();

        try {
            INN = scanner.next();
            if (!checkTIN(INN)) throw new INN_Exeption("Ошибка ввода ИНН");
            System.out.println("Все в порядке");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkTIN(String INN){
        for (int i = 0; i < INN.length(); i++){
            if (!Character.isDigit(INN.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

class INN_Exeption extends Exception{
    public INN_Exeption(String message){
        super(message);
    }
}