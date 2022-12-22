package ru.mirea.task24;

import java.util.ArrayList;

public class Main {

    private static void testList() {
        // Create a list to store russian cities
        ArrayList<String> cities = new ArrayList<String>();
        // Add some cities to the list
        cities.add("Владивосток");
        cities.add("Краснодар");
        cities.add(0, "Санкт-Петербург");
        cities.add(0, "Москва");
        cities.add("Красноярск");
        cities.add("Сочи");

        // Print out element count and all elements
        System.out.printf("В списке %d элементов: \n", cities.size());
        for(String city : cities){
            System.out.println(city);
        }
        System.out.println();

        // Check if list contains some city, else print an error
        if(cities.contains("Краснодар")){
            System.out.println("Список содержит город Краснодар");
        }
        else{
            System.out.println("Ошибка: Список не содержит город Краснодар");
        }
        // Check if list does not contain some city not in the list, else print an error
        if(!cities.contains("Казань")){
            System.out.println("Список не содержит город Казань");
        }
        else{
            System.out.println("Ошибка: Список содержит город Казань");
        }

        // Remove some cities from the list, report each removal
        System.out.println("Удаляем город Красноярск");
        cities.remove("Красноярск");
        System.out.println("Удаляем город Сочи");
        cities.remove("Сочи");
        System.out.println("Удаляем первый город в списке - " + cities.get(0));
        cities.remove(0);
        System.out.println("Удаляем последний город в списке - " + cities.get(cities.size() - 1));
        cities.remove(cities.size() - 1);

        System.out.println();

        // Print out element count and all elements
        System.out.printf("В списке %d элементов: \n", cities.size());
        for(String city : cities){
            System.out.println(city);
        }

    }

    public static void main(String[] args) {
        testList();
    }
}

