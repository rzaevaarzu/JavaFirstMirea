package ru.mirea.task2;

import java.util.ArrayList;

public class TestDog {
    public final ArrayList<Dog> dogs = new ArrayList<Dog>();

    public void addDog(String nick, int age) {
        dogs.add(new Dog(nick, age));
    }
}
