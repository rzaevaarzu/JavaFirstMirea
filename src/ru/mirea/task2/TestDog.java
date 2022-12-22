package ru.mirea.task2;

import java.util.Scanner;
import java.util.Vector;

public class TestDog {

    public static void add_dogs(Vector<Dog> a, int count,Scanner scanner) {
        for(int i=0;i<count;i++){
            System.out.print("Введите имя собаки: ");
            String name=scanner.next();
            System.out.print("Введите возраст собаки: ");
            int age=scanner.nextInt();
            a.add(new Dog(name,age));
        }
    }
    public static void out_put(Vector<Dog> dogs){
        for(int i=0;i<dogs.size();i++){
            System.out.print(dogs.get(i));
        }
    }
    public static void main(String[] args) {
        Vector<Dog> dogs=new Vector<Dog>();

        dogs.add(new Dog("Scooby", 8));
        dogs.add(new Dog("Sharik",4));
        System.out.print("Первоначальный массив: ");
        out_put(dogs);
        System.out.print("\nВведите количество собак, которые следует добавить в массив: ");
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        add_dogs(dogs,count,scanner);
        System.out.print("Конечный массив: ");
        out_put(dogs);
    }
}