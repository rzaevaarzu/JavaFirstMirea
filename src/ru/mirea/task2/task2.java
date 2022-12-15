package ru.mirea.task2;

import java.util.ArrayList;

public class Shape {
    private String name;
    private String color;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name - " + color + "\nColor - " + name;
    }
}

public class Ball {
    private String color;
}


public class Book {
    private String name;
    private String author;
    private String genre;
}

public class TestDog {
    public final ArrayList<Dog> dogs = new ArrayList<Dog>();

    public void addDog(String nick, int age) {
        dogs.add(new Dog(nick, age));
    }
}


public class Dog {
    private String nick;
    private int age;

    public Dog(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int humanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Nick - " + nick +
                "\nAge - " + age;
    }
}
