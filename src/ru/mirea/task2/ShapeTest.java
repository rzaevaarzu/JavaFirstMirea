package ru.mirea.task2;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите название фигуры: ");
        String sh1=scanner.next();
        System.out.print("\n");
        Shape shape = new Shape(sh1);
        System.out.println("Тип shape: " + shape.toString());
    }
}